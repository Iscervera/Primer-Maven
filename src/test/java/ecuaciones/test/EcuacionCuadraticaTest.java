package ecuaciones.test;

import ecuaciones.EcuacionCuadratica;
import org.junit.Test;

import static org.junit.Assert.*;

public class EcuacionCuadraticaTest {

    @Test
    public void solucionDiscriminanteCero() {

        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, -4, 4);
        float[] respuesta = new float[2];
        respuesta[0] = 2;
        respuesta[1] = 2;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

        ecuacionCuadratica = new EcuacionCuadratica(1, -8, 16);
        respuesta[0] = 4;
        respuesta[1] = 4;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

        ecuacionCuadratica = new EcuacionCuadratica(-1, 6, -9);
        respuesta[0] = 3;
        respuesta[1] = 3;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

    }
    @Test
    public void solucionDiscriminantePositivo() {

        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(3, -11, -4);
        float[] respuesta = new float[2];
        respuesta[0] = 4;
        respuesta[1] = -1/3.f;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

        ecuacionCuadratica = new EcuacionCuadratica(3, 2, -8);
        respuesta[0] = 4/3.f;
        respuesta[1] = -2;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

        ecuacionCuadratica = new EcuacionCuadratica(1, 3, 2);
        respuesta[0] = -1;
        respuesta[1] = -2;
        assertArrayEquals(respuesta, ecuacionCuadratica.solucion(), 0);

    }
    @Test
    public void solucionDiscriminanteNegativo() {

        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, -4, 10);
        try{
         ecuacionCuadratica.solucion();
        } catch (IllegalArgumentException e){
            System.out.println("Ecuación sin raices reales");
        }

        ecuacionCuadratica = new EcuacionCuadratica(3, 5, 3);
        try{
            ecuacionCuadratica.solucion();
        } catch (IllegalArgumentException e){
            System.out.println("Ecuación sin raices reales");
        }

        ecuacionCuadratica = new EcuacionCuadratica(2, 7, 10);
        try{
            ecuacionCuadratica.solucion();
        } catch (IllegalArgumentException e){
            System.out.println("Ecuación sin raices reales");
        }
    }

}