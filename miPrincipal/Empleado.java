package miPrincipal;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;
    protected boolean registroCerrado;

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.registroCerrado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean estaRegistroCerrado() {
        return registroCerrado;
    }

    public void aumentarSalario(double monto) {
        if (monto > 0) {
            salarioBase += monto;
        }
    }

    public double calcularPago() {
        return salarioBase;
    }

    public void cerrarRegistro() {
        registroCerrado = true;
    }

    public String mostrarDatos() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                ", pagoFinal=" + calcularPago() +
                ", registroCerrado=" + registroCerrado +
                '}';
    }
}