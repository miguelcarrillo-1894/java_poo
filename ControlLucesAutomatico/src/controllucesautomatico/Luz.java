/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomatico;

/**
 *
 * @author Usuario
 */
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

