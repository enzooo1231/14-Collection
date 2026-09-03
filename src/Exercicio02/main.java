package Exercicio02;

import java.util.HashSet;
import java.util.Set;

public class main {
    static void main() {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno("Enzo", 10));
        lista.add(new Aluno("Enzo", 10));
        lista.add(new Aluno("Maria", 20));
        lista.add(new Aluno("Age", 30));

        lista.forEach(aluno ->{
            System.out.println(aluno);
        });

    }
}
