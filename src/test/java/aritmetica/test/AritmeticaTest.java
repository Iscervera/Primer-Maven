package aritmetica.test;

import aritmetica.Aritmetica;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AritmeticaTest {

    @Test
    public void testSuma() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(2, aritmetica.suma(1, 1), 0);
    }
    @Test
    public void testResta() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(3, aritmetica.resta(4, 1), 0);
    }
    @Test
    public void testMultiplicacion() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(6, aritmetica.multiplicacion(2, 3), 0);
    }
    @Test
    public void testDivision() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(5, aritmetica.division(10, 2), 0);
    }
}
