/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllucesautomatico;

/**
 *
 * @author Usuario
 */
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

