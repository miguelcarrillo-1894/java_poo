
package controllucesautomatico;

import java.util.Random;

public class SensorMovimiento {
    private boolean movimientoDetectado;

    public boolean isMovimientoDetectado() {
        return movimientoDetectado;
    }

    public void detectarMovimiento() {
        Random random = new Random();
        movimientoDetectado = random.nextBoolean();
        System.out.println("Movimiento " + (movimientoDetectado ? "detectado." : "no detectado."));
    }
}

