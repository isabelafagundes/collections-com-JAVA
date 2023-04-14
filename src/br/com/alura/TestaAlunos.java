package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Isabela Fagundes");
        alunos.add("Isabely Santos");
        alunos.add("Isabelle Rodriguez");
        alunos.add("Elisabeth Pinto");

        boolean pauloEstaMatriculado = alunos.contains("Julberto");
        alunos.remove("Rodrigo Turini");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for ( String aluno : alunos ) {
            System.out.println(aluno);
        }

        List<String> alunosSetEmList = new ArrayList<>(alunos);
        //Uma List pode receber um Set em seu construtor, e assim se torna possível ordená-lo
        Collections.sort(alunosSetEmList);
        System.out.println(alunosSetEmList);

/*
        Set<String> alunosSincronizados = Collections.synchronizedSet(alunos);
        System.out.println(alunosSincronizados);
*/

    }

}
