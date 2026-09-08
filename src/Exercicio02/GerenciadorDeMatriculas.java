package Exercicio02;

import java.util.*;

public class GerenciadorDeMatriculas {
    static void main() {
        //disciplina de estrutura de dados
        Set<Aluno> estrutura = new HashSet<>();
        estrutura.add((new Aluno(10, "Selmini")));
        estrutura.add((new Aluno(20, "Patricia")));
        estrutura.add((new Aluno(30, "Agessandro")));

        //disciplina de banco de dados
        Set<Aluno> banco = new HashSet<>();
        banco.add((new Aluno(50, "Israel")));
        banco.add((new Aluno(20, "Patricia")));
        banco.add((new Aluno(60, "Evelyn")));

        // união das turmas
        System.out.println("Alunos matriculados em Banco de dados e Estrutura de dados");
        Set<Aluno> uniao = new HashSet<>(estrutura);
        uniao.addAll(banco);


       uniao.forEach(aluno -> {
           System.out.println(aluno);
       });

        // alunos que estão matriculados nas duas disciplinas --> interseção

        System.out.println();
        System.out.println("\nAlunos matriculados em Banco de Dados e Estrutura de Dados");

        Set<Aluno> inter = new HashSet<>(estrutura);
        inter.retainAll(banco);

        inter.forEach(aluno -> {
            System.out.println(inter);
        });


        //alunos que estão matriculados apenas em Estrutura de Dados
        System.out.println("\nAlunos matriculados apenas em Estrutura de Dados");
        Set<Aluno> sohEstrutura = new HashSet<>(estrutura);
        sohEstrutura.removeAll(banco);
        List<Aluno> lista = new ArrayList<>(sohEstrutura);
        lista.sort(Comparator.comparing(Aluno::getNome));
        lista.forEach(aluno -> {
            System.out.println(lista);
        });


    }
}
