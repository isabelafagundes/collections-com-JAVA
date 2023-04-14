package br.com.alura;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominandos as coleções do Java", "Isabela Fagundes");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        Aluno a1 = new Aluno("Isabela Fagundes", 1234);
        Aluno a2 = new Aluno("Maria Clara", 1244);
        Aluno a3 = new Aluno("Souza Menezes", 1255);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos do curso: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

//        Set<String> nomes = Collections.emptySet();
//        nomes.add("Paulo");

        System.out.println("Aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        String nome = "Isabela Fagundes";
        Aluno isabela = new Aluno("Isabela Fagundes", 12345);
        System.out.println(javaColecoes.estaMatriculado(isabela));

        System.out.println(isabela.equals(a1));

        System.out.println(a1.hashCode() == isabela.hashCode());

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()){
            Aluno proximo = iterador.next();
            System.out.println("-> " + proximo);
        }

    }

}
