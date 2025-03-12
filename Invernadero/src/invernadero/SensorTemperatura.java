
package invernadero;


import java.util.Scanner;

public class SensorTemperatura {
    private double temperatura;
    private Calefactor calefactor;
    private Ventilador ventilador;

    public SensorTemperatura() {
        calefactor = new Calefactor();
        ventilador = new Ventilador();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void iniciarLectura() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese la temperatura actual del invernadero: ");
            setTemperatura(scanner.nextDouble());
            verificarEstado();
            try {
                Thread.sleep(5000); // Espera de 5 segundos
            } catch (InterruptedException e) {
                System.out.println("Error en la simulación.");
            }
        }
    }

    private void verificarEstado() {
        if (temperatura < 10) {
            calefactor.encender();
            ventilador.apagar();
        } else if (temperatura > 25) {
            ventilador.encender();
            calefactor.apagar();
        } else {
            calefactor.apagar();
            ventilador.apagar();
            System.out.println("Sistema inactivo.");
        }
    }
}

