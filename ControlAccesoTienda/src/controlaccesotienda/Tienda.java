
package controlaccesotienda;

import java.util.Scanner;

public class Tienda {
    private boolean horarioAtencion;

    public Tienda() {
        horarioAtencion = true; // Suponiendo que está en horario de atención
    }

    public boolean isHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(boolean horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSistema de Control de Acceso a la Tienda");
            System.out.println("1. Acceso de Cliente");
            System.out.println("2. Acceso de Empleado");
            System.out.println("3. Cambiar horario de atención");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente.ingresarDatos();
                    if (cliente.tieneAcceso(horarioAtencion)) {
                        System.out.println("Acceso permitido al cliente.");
                    } else {
                        System.out.println("Acceso denegado al cliente.");
                    }
                    break;
                case 2:
                    Empleado empleado = new Empleado();
                    empleado.ingresarDatos();
                    if (empleado.tieneAcceso()) {
                        System.out.println("Acceso permitido al empleado.");
                    } else {
                        System.out.println("Acceso denegado al empleado.");
                    }
                    break;
                case 3:
                    System.out.print("¿Está en horario de atención? (true/false): ");
                    setHorarioAtencion(scanner.nextBoolean());
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

