
package controlaireacondicionado;

import java.util.Random;

public class SensorHumedad {
    private int humedad;

    public int getHumedad() {
        return humedad;
    }

    public void leerHumedad() {
        Random random = new Random();
        humedad = 40 + random.nextInt(41); // Humedad entre 40% y 80%
        System.out.println("Humedad actual: " + humedad + "%");
    }
}

