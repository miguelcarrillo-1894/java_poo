
package invernadero;


public class Ventilador {
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
        System.out.println("Ventilador encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Ventilador apagado.");
    }
}

