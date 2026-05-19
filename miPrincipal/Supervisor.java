package miPrincipal;

public class Supervisor extends Empleado {
    private double bonoFijo;

    public Supervisor(String nombre, int id, double salarioBase, double bonoFijo) {
        super(nombre, id, salarioBase);
        this.bonoFijo = bonoFijo;
    }

    public double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        if (bonoFijo >= 0) {
            this.bonoFijo = bonoFijo;
        }
    }

    @Override
    public double calcularPago() {
        return salarioBase + bonoFijo;
    }

    @Override
    public String mostrarDatos() {
        return "Supervisor{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                ", bonoFijo=" + bonoFijo +
                ", pagoFinal=" + calcularPago() +
                ", registroCerrado=" + registroCerrado +
                '}';
    }
}