
package deteccionintrusossensores;


import java.util.Scanner;

public class SistemaAlarma {
    private boolean alarmaActivada;
    private boolean esDeNoche;
    private Alarma alarma;
    private SensorMovimiento sensor1;
    private SensorMovimiento sensor2;
    private SensorMovimiento sensor3;

    public SistemaAlarma() {
        alarma = new Alarma();
        sensor1 = new SensorMovimiento("Sensor 1");
        sensor2 = new SensorMovimiento("Sensor 2");
        sensor3 = new SensorMovimiento("Sensor 3");
        alarmaActivada = false;
        esDeNoche = false;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de Detección de Intrusos");
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Simular detección de movimiento");
            System.out.println("4. Cambiar estado de día/noche");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    activarAlarma();
                    break;
                case 2:
                    desactivarAlarma();
                    break;
                case 3:
                    detectarMovimiento();
                    break;
                case 4:
                    cambiarEstadoDiaNoche();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void activarAlarma() {
        alarmaActivada = true;
        System.out.println("Alarma activada.");
    }

    public void desactivarAlarma() {
        alarmaActivada = false;
        alarma.desactivar();
        System.out.println("Alarma desactivada.");
    }

    public void cambiarEstadoDiaNoche() {
        esDeNoche = !esDeNoche;
        System.out.println("Ahora es " + (esDeNoche ? "noche." : "día."));
    }

    public void detectarMovimiento() {
        if (!alarmaActivada) {
            System.out.println("La alarma está desactivada.");
            return;
        }

        sensor1.detectarMovimiento();
        sensor2.detectarMovimiento();
        sensor3.detectarMovimiento();

        int sensoresActivos = 0;
        if (sensor1.isMovimientoDetectado()) sensoresActivos++;
        if (sensor2.isMovimientoDetectado()) sensoresActivos++;
        if (sensor3.isMovimientoDetectado()) sensoresActivos++;

        if (sensoresActivos >= 2 && esDeNoche) {
            alarma.activar();
        } else {
            alarma.desactivar();
            System.out.println("No se detectaron suficientes movimientos o no es de noche.");
        }
    }
}
