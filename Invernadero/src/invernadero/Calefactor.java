/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invernadero;

/**
 *
 * @author Usuario
 */
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

