
package fizzbuzzz;

public class FizzBuzz {

    public void jugar() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(generarMensaje(i));
        }
    }

    private String generarMensaje(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(numero);
        }
    }
}
