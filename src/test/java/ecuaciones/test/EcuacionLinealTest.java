package ecuaciones.test;

import ecuaciones.EcuacionLineal;
import org.junit.Test;

import static org.junit.Assert.*;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0);
        assertEquals(0f, ecuacionLineal.solucion(), 0);
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1);
        assertEquals(-1.0f, ecuacionLineal.solucion(), 0);

        ecuacionLineal = new EcuacionLineal(2, -2);
        assertEquals(1.0f, ecuacionLineal.solucion(), 0);

		ecuacionLineal = new EcuacionLineal(2, 1);
		assertEquals(-0.5f, ecuacionLineal.solucion(), 0);

        ecuacionLineal = new EcuacionLineal(3, -4);
        assertEquals(4/3f, ecuacionLineal.solucion(), 0);

	}
}