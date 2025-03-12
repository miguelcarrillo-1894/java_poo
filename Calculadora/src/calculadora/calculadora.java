
package calculadora;

import java.util.Scanner;

public class calculadora {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCalculadora Simple");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = realizarOperacion(opcion, num1, num2);
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }

    private double realizarOperacion(int opcion, double num1, double num2) {
        switch (opcion) {
            case 1:
                Suma suma = new Suma();
                return suma.calcular(num1, num2);
            case 2:
                Resta resta = new Resta();
                return resta.calcular(num1, num2);
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                return multiplicacion.calcular(num1, num2);
            case 4:
                Division division = new Division();
                return division.calcular(num1, num2);
            default:
                System.out.println("Opción no válida.");
                return 0;
        }
    }
}
