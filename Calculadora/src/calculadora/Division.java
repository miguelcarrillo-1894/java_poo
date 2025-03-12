
package calculadora;

public class Division {
    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0;
        }
        return a / b;
    }
}

