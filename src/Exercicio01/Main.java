package Exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Patricia", 0, 20));
        lista.add(new Candidato("Selmini",10, 26));
        lista.add(new Candidato("Antonio",7, 20));
        lista.add(new Candidato("Lorena",9.9, 18));

        //ordenação
        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica)
                .thenComparingInt(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome));

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
