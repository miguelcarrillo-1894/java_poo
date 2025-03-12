
package invernadero;

public class Calefactor {
    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        encendido = true;
        System.out.println("Calefactor encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Calefactor apagado.");
    }
}

