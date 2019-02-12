package tabla;

import conversor.Escala;
import conversor.Conversor;

import java.util.ArrayList;
import java.util.List;

public class TablaConversion {

    private List<Escala> escalas = new ArrayList<>();

    public void addEscala(Escala nuevaEscala){

        escalas.add(nuevaEscala);

    }

    public String escribeTabla() {

        Conversor conversor = new Conversor();
        double lambda;
        StringBuilder sb = new StringBuilder();
        //Esto es únicamente por apariencia
        for(Escala escala:escalas){
            sb.append(String.format("|%10s|",escala.getEscala()));
        }
        sb.append("\n");

        for(Escala escala:escalas){
            sb.append(String.format("%10s","------------"));
        }

        sb.append("\n");
        // Aqui acaba la cabecera
        for (int i = 0; i <= 100; i += 5) {

            lambda = conversor.getLambda(escalas.get(0),(float) i);

            for(Escala escala:escalas){
                sb.append(String.format("|%10.2f|",(float) conversor.convertir(escala, lambda)));
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}
