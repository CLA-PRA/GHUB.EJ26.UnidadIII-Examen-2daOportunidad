package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
	void criterio1HerenciaBaseDerivada_25pts() {
		Repartidor r = new Repartidor("Ana", 1, 1000.0, 10);
		Chofer c = new Chofer("Luis", 2, 1000.0, 50.0);
		Supervisor s = new Supervisor("Marta", 3, 1000.0, 200.0);
		Auxiliar a = new Auxiliar("Jose", 4, 1000.0, 10);

		assertTrue(r instanceof Empleado);
		assertTrue(c instanceof Empleado);
		assertTrue(s instanceof Empleado);
		assertTrue(a instanceof Empleado);
	}

	@Test
	void criterio2ReutilizacionMiembrosHeredados_25pts() {
		Repartidor r = new Repartidor("Ana", 1, 1000.0, 10);

		assertEquals("Ana", r.getNombre());
		assertEquals(1, r.getId());
		assertEquals(1000.0, r.getSalarioBase(), 0.001);

		r.aumentarSalario(200.0);
		assertEquals(1200.0, r.getSalarioBase(), 0.001);

		assertFalse(r.estaRegistroCerrado());
		r.cerrarRegistro();
		assertTrue(r.estaRegistroCerrado());
	}

	@Test
	void criterio3UsoDeSuperConstructoresYMetodos_25pts() {
		Chofer c = new Chofer("Luis", 2, 1000.0, 25.0);

		assertEquals("Luis", c.getNombre());
		assertEquals(2, c.getId());
		assertEquals(1000.0, c.getSalarioBase(), 0.001);

		c.aumentarSalario(100.0);
		assertEquals(1100.0, c.getSalarioBase(), 0.001);
	}

	@Test
	void criterio4RedefinicionDeMetodos_25pts() {
		Repartidor r = new Repartidor("Ana", 1, 1000.0, 10);
		Chofer c = new Chofer("Luis", 2, 1000.0, 25.0);
		Supervisor s = new Supervisor("Marta", 3, 1000.0, 200.0);
		Auxiliar a = new Auxiliar("Jose", 4, 1000.0, 10);

		assertEquals(1050.0, r.calcularPago(), 0.001);
		assertEquals(1050.0, c.calcularPago(), 0.001);
		assertEquals(1200.0, s.calcularPago(), 0.001);
		assertEquals(1400.0, a.calcularPago(), 0.001);

		assertTrue(r.mostrarDatos().contains("Repartidor{"));
		assertTrue(c.mostrarDatos().contains("Chofer{"));
		assertTrue(s.mostrarDatos().contains("Supervisor{"));
		assertTrue(a.mostrarDatos().contains("Auxiliar{"));
	}

	
}