package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominandos as coleções do Java", "Isabela Fagundes");

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("Tempo total: " + javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }

}
