/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaireacondicionado;

/**
 *
 * @author Usuario
 */
import java.util.Random;

public class SensorTemperatura {
    private int temperatura;

    public int getTemperatura() {
        return temperatura;
    }

    public void leerTemperatura() {
        Random random = new Random();
        temperatura = 20 + random.nextInt(16); 
        System.out.println("Temperatura actual: " + temperatura + "°C");
    }
}

