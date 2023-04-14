package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominandos as coleções do Java", "Isabela Fagundes");

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        System.out.println(javaColecoes.getAulas());

    }

}
