package CineReservas;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala(5); 
        int opcion;

        System.out.println("Bienvenido al sistema de reservas del cine");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Reservar asiento");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Mostrar asientos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            if (opcion == 1) {
                if (sala.hayDisponibilidad()) {
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese su edad: ");
                    int edad = scanner.nextInt();

                    System.out.print("Ingrese su ID de usuario: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine(); 

                    Usuario usuario = new Usuario(nombre, edad, idUsuario);

                    if (sala.reservarAsiento()) {
                        System.out.println("Reserva exitosa para " + usuario.nombre);
                    } else {
                        System.out.println("Lo sentimos, la sala esta llena.");
                    }
                } else {
                    System.out.println("No hay mas asientos disponibles.");
                }
            } else if (opcion == 2) {
                if (sala.cancelarReserva()) {
                    System.out.println("Reserva cancelada con exito.");
                } else {
                    System.out.println("No hay reservas para cancelar.");
                }
            } else if (opcion == 3) {
                sala.mostrarAsientos();
            } else if (opcion != 4) {
                System.out.println("Opcion invalida, intente nuevamente.");
            }
        } while (opcion != 4);

        System.out.println("Gracias por usar el sistema de reservas.");
        scanner.close();
    }
}