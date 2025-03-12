
package controlaireacondicionado;

import java.util.Scanner;

public class SistemaAire {
    private SensorTemperatura sensorTemperatura;
    private SensorHumedad sensorHumedad;
    private boolean aireEncendido;

    public SistemaAire() {
        sensorTemperatura = new SensorTemperatura();
        sensorHumedad = new SensorHumedad();
        aireEncendido = false;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de Control de Aire Acondicionado");
            System.out.println("1. Actualizar temperatura");
            System.out.println("2. Actualizar humedad");
            System.out.println("3. Ver estado del aire acondicionado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    actualizarTemperatura();
                    break;
                case 2:
                    actualizarHumedad();
                    break;
                case 3:
                    mostrarEstadoAire();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public void actualizarTemperatura() {
        sensorTemperatura.leerTemperatura();
        controlarAire();
    }

    public void actualizarHumedad() {
        sensorHumedad.leerHumedad();
        controlarAire();
    }

    public void controlarAire() {
        int temperatura = sensorTemperatura.getTemperatura();
        int humedad = sensorHumedad.getHumedad();

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encenderAire();
        } else {
            apagarAire();
        }
    }

    public void encenderAire() {
        if (!aireEncendido) {
            aireEncendido = true;
            System.out.println("Aire acondicionado encendido.");
        }
    }

    public void apagarAire() {
        if (aireEncendido) {
            aireEncendido = false;
            System.out.println("Aire acondicionado apagado.");
        }
    }

    public void mostrarEstadoAire() {
        System.out.println("El aire acondicionado está " + (aireEncendido ? "encendido." : "apagado."));
    }
}
