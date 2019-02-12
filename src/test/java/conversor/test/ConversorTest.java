package conversor.test;

import conversor.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTest {

    Conversor conversor = new Conversor();

    @Test
    public void getLambda() {

        Escala escala = new Fahrenheit();
        assertEquals(0.1, conversor.getLambda(escala, 50),0.0001);

        escala = new Reaumur();
        assertEquals(0.625, conversor.getLambda(escala, 50),0.0001);

        escala = new Celsius();
        assertEquals(0.5, conversor.getLambda(escala, 50),0.0001);

    }

    @Test
    public void convertir() {

        Escala escala = new Fahrenheit();
        assertEquals(50, conversor.convertir(escala, conversor.getLambda(escala, 50)),0.0001);
        assertEquals(10, conversor.convertir(new Celsius(), conversor.getLambda(escala, 50)),0.0001);
        assertEquals(8, conversor.convertir(new Reaumur(), conversor.getLambda(escala, 50)),0.0001);

        escala = new Reaumur();
        assertEquals(50, conversor.convertir(escala, conversor.getLambda(escala, 50)),0.0001);
        assertEquals(62.5, conversor.convertir(new Celsius(), conversor.getLambda(escala, 50)),0.0001);
        assertEquals(144.5, conversor.convertir(new Fahrenheit(), conversor.getLambda(escala, 50)),0.0001);

        escala = new Celsius();
        assertEquals(50, conversor.convertir(escala, conversor.getLambda(escala, 50)),0.0001);
        assertEquals(122, conversor.convertir(new Fahrenheit(), conversor.getLambda(escala, 50)),0.0001);
        assertEquals(40, conversor.convertir(new Reaumur(), conversor.getLambda(escala, 50)),0.0001);

    }
}