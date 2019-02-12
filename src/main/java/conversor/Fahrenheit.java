package conversor;

public class Fahrenheit implements Escala {

    private String escala;
    private double puntoCongelacion;
    private double puntoEbullicion;

    public Fahrenheit() {

        this.escala = "Farenheit";
        this.puntoCongelacion = 32;
        this.puntoEbullicion = 212;

    }
    @Override
    public String getEscala() {

        return escala;

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
