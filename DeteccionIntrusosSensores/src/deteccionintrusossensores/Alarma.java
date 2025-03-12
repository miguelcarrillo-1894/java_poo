/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusossensores;

/**
 *
 * @author Usuario
 */
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

