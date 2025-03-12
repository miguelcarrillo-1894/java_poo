package CineReservas;

import CineReservas.Asiento;

public class Sala {
    private Asiento[] asientos;
    private int capacidad;

    public Sala(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new Asiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Asiento();
        }
    }

    public boolean reservarAsiento() {
        for (Asiento asiento : asientos) {
            if (!asiento.estaOcupado()) {
                asiento.reservar();
                return true;
            }
        }
        return false;
    }

    public boolean cancelarReserva() {
        for (Asiento asiento : asientos) {
            if (asiento.estaOcupado()) {
                asiento.cancelar();
                return true;
            }
        }
        return false;
    }

    public boolean hayDisponibilidad() {
        for (Asiento asiento : asientos) {
            if (!asiento.estaOcupado()) {
                return true;
            }
        }
        return false;
    }

    public void mostrarAsientos() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < capacidad; i++) {
            System.out.print(asientos[i].estaOcupado() ? "[X] " : "[ ] ");
        }
        System.out.println();
    }
}