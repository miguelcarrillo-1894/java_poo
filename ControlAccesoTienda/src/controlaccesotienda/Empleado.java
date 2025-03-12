
package controlaccesotienda;

import java.util.Scanner;

public class Empleado {
    private boolean esEmpleado;

    public Empleado() {
        esEmpleado = false;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es empleado de la tienda? (true/false): ");
        setEsEmpleado(scanner.nextBoolean());
    }

    public boolean tieneAcceso() {
        return esEmpleado;
    }
}

