package miPrincipal;

public class Chofer extends Empleado {
    private double kilometrosRecorridos;

    public Chofer(String nombre, int id, double salarioBase, double kilometrosRecorridos) {
        super(nombre, id, salarioBase);
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        if (kilometrosRecorridos >= 0) {
            this.kilometrosRecorridos = kilometrosRecorridos;
        }
    }

    @Override
    public double calcularPago() {
        return salarioBase + (kilometrosRecorridos * 2.0);
    }

    @Override
    public String mostrarDatos() {
        return "Chofer{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                ", kilometrosRecorridos=" + kilometrosRecorridos +
                ", pagoFinal=" + calcularPago() +
                ", registroCerrado=" + registroCerrado +
                '}';
    }
}