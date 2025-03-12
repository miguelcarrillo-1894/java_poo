package CineReservas;

public class Asiento {
    private boolean ocupado;

    public Asiento() {
        this.ocupado = false;
    }

    public boolean estaOcupado() {
        return ocupado;
    }

    public void reservar() {
        ocupado = true;
    }

    public void cancelar() {
        ocupado = false;
    }
}