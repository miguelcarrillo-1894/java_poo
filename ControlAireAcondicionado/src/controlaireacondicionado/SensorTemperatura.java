
package controlaireacondicionado;

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

