package miPrincipal;

public class Principal {

    public static void main(String[] args) {
        Repartidor repartidor = new Repartidor("Ana", 101, 1200.0, 80);
        Chofer chofer = new Chofer("Luis", 102, 1500.0, 340.5);
        Supervisor supervisor = new Supervisor("Marta", 103, 2000.0, 450.0);
        Auxiliar auxiliar = new Auxiliar("Jose", 104, 1100.0, 12);

        repartidor.aumentarSalario(100.0);
        chofer.aumentarSalario(100.0);
        supervisor.aumentarSalario(100.0);
        auxiliar.aumentarSalario(100.0);

        System.out.println("=== Nomina semanal ===");
        System.out.println(repartidor.mostrarDatos());
        System.out.println(chofer.mostrarDatos());
        System.out.println(supervisor.mostrarDatos());
        System.out.println(auxiliar.mostrarDatos());

        repartidor.cerrarRegistro();
        chofer.cerrarRegistro();
        supervisor.cerrarRegistro();
        auxiliar.cerrarRegistro();

        System.out.println("=== Registro cerrado ===");
        System.out.println(repartidor.mostrarDatos());
        System.out.println(chofer.mostrarDatos());
        System.out.println(supervisor.mostrarDatos());
        System.out.println(auxiliar.mostrarDatos());
    }
}