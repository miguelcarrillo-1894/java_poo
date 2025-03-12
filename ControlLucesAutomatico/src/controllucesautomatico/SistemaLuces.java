/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomatico;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaLuces {
    private boolean esDeNoche;
    private SensorMovimiento sensor;
    private Luz luz;

    public SistemaLuces() {
        esDeNoche = false;
        sensor = new SensorMovimiento();
        luz = new Luz();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de Control de Luces Automático");
            System.out.println("1. Cambiar estado de día/noche");
            System.out.println("2. Simular movimiento");
            System.out.println("3. Ver estado de la luz");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cambiarEstadoDiaNoche();
                    break;
                case 2:
                    simularMovimiento();
                    break;
                case 3:
                    mostrarEstadoLuz();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void cambiarEstadoDiaNoche() {
        esDeNoche = !esDeNoche;
        System.out.println("Ahora es " + (esDeNoche ? "noche." : "día."));
    }

    public void simularMovimiento() {
        sensor.detectarMovimiento();
        controlarLuz();
    }

    public void controlarLuz() {
        if (esDeNoche && sensor.isMovimientoDetectado()) {
            luz.encender();
        } else {
            luz.apagar();
        }
    }

    public void mostrarEstadoLuz() {
        System.out.println("La luz está " + (luz.isEncendida() ? "encendida." : "apagada."));
    }
}

