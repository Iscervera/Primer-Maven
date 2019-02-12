package conversor;

public class Reaumur implements Escala {

    private String escala;
    private double puntoCongelacion;
    private double puntoEbullicion;

    public Reaumur() {

        this.escala = "Reaumur ";
        this.puntoCongelacion = 0;
        this.puntoEbullicion = 80;

    }

    @Override
    public String getEscala() {

        return this.escala;

    }

    @Override
    public double getPuntoEbullicion() {

        return this.puntoEbullicion;

    }

    @Override
    public double getPuntoCongelacion() {

        return this.puntoCongelacion;

    }
}
