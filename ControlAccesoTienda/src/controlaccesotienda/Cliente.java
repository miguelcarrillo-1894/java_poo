
package controlaccesotienda;


import java.util.Scanner;

public class Cliente {
    private boolean tieneMembresia;

    public Cliente() {
        tieneMembresia = false;
    }

    public boolean isTieneMembresia() {
        return tieneMembresia;
    }

    public void setTieneMembresia(boolean tieneMembresia) {
        this.tieneMembresia = tieneMembresia;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene membresía válida? (true/false): ");
        setTieneMembresia(scanner.nextBoolean());
    }

    public boolean tieneAcceso(boolean horarioAtencion) {
        return tieneMembresia && horarioAtencion;
    }
}
