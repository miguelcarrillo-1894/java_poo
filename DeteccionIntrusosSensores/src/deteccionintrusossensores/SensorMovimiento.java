
package deteccionintrusossensores;

import java.util.Random;

public class SensorMovimiento {
    private String nombre;
    private boolean movimientoDetectado;

    public SensorMovimiento(String nombre) {
        this.nombre = nombre;
        this.movimientoDetectado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMovimientoDetectado() {
        return movimientoDetectado;
    }

    public void detectarMovimiento() {
        Random random = new Random();
        movimientoDetectado = random.nextBoolean();
        System.out.println(nombre + (movimientoDetectado ? " detectó movimiento." : " no detectó movimiento."));
    }
}

