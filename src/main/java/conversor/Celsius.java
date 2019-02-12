package conversor;

public class Celsius implements Escala {

    private String escala;
    private double puntoCongelacion;
    private double puntoEbullicion;

    public Celsius() {

        this.escala = "Celsius ";
        this.puntoCongelacion = 0;
        this.puntoEbullicion = 100;

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
