package conversor;

public class Conversor {

    public double getLambda(Escala escala, double temperatura){

        return ((temperatura - escala.getPuntoCongelacion()) / (escala.getPuntoEbullicion() - escala.getPuntoCongelacion()));

    }
    public double convertir(Escala escala, double lambda){

        return ((1 - lambda) * escala.getPuntoCongelacion() + lambda * escala.getPuntoEbullicion());

    }
}
