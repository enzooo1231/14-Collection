package Exercicio03;

import java.util.HashMap;
import java.util.Map;

public class main {
    static void main() {
        Map<Integer, aluno> lista = new HashMap<>();

        lista.put(10, new aluno("Selmini", 10));
        lista.put(20, new aluno("Age", 20));
        lista.put(10, new aluno("Selmini", 10));
        lista.put(30, new aluno("Evelyn", 30));

        lista.forEach((rm, aluno) ->{
            System.out.println(aluno);
        });

        System.out.println();

        for (Map.Entry<Integer, aluno> item : lista.entrySet()){
            System.out.println("RM: " +item.getKey() + " | " + item.getValue());
        }
    }
}
