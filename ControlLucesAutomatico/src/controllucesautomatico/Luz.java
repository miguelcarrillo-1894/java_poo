
package controllucesautomatico;

public class Luz {
    private boolean encendida;

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        encendida = true;
        System.out.println("Luz encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Luz apagada.");
    }
}

