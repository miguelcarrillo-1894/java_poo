package CineReservas;

public class Usuario extends Persona {
    private int idUsuario;

    public Usuario(String nombre, int edad, int idUsuario) {
        super(nombre, edad);
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}