package miPrincipal;

public class Auxiliar extends Empleado {
    private int horasExtra;

    public Auxiliar(String nombre, int id, double salarioBase, int horasExtra) {
        super(nombre, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        if (horasExtra >= 0) {
            this.horasExtra = horasExtra;
        }
    }

    @Override
    public double calcularPago() {
        return salarioBase + (horasExtra * 40.0);
    }

    @Override
    public String mostrarDatos() {
        return "Auxiliar{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                ", horasExtra=" + horasExtra +
                ", pagoFinal=" + calcularPago() +
                ", registroCerrado=" + registroCerrado +
                '}';
    }
}