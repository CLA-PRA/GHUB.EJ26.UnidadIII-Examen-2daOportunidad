package miPrincipal;

public class Repartidor extends Empleado {
    private int paquetesEntregados;

    public Repartidor(String nombre, int id, double salarioBase, int paquetesEntregados) {
        super(nombre, id, salarioBase);
        this.paquetesEntregados = paquetesEntregados;
    }

    public int getPaquetesEntregados() {
        return paquetesEntregados;
    }

    public void setPaquetesEntregados(int paquetesEntregados) {
        if (paquetesEntregados >= 0) {
            this.paquetesEntregados = paquetesEntregados;
        }
    }

    @Override
    public double calcularPago() {
        return salarioBase + (paquetesEntregados * 5.0);
    }

    @Override
    public String mostrarDatos() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                ", paquetesEntregados=" + paquetesEntregados +
                ", pagoFinal=" + calcularPago() +
                ", registroCerrado=" + registroCerrado +
                '}';
    }
}