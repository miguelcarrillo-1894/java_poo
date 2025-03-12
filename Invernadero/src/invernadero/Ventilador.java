/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invernadero;

/**
 *
 * @author Usuario
 */
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

