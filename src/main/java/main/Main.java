package main;

import conversor.Celsius;
import conversor.Fahrenheit;
import conversor.Reaumur;
import tabla.TablaConversion;

public class Main {

    public static void main(String[] args) {

        TablaConversion tabla = new TablaConversion();

        tabla.addEscala(new Reaumur());
        tabla.addEscala(new Fahrenheit());
        tabla.addEscala(new Celsius());

        System.out.println(tabla.escribeTabla());

    }

}
