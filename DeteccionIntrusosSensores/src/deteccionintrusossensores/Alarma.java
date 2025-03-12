
package deteccionintrusossensores;


public class Alarma {
    private boolean activada;

    public boolean isActivada() {
        return activada;
    }

    public void activar() {
        activada = true;
        System.out.println("¡Alarma activada! Intruso detectado.");
    }

    public void desactivar() {
        activada = false;
        System.out.println("Alarma desactivada.");
    }
}

