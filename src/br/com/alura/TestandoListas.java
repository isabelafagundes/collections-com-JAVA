package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1); //adiciona objetos
        aulas.add(aula2); //adiciona objetos
        aulas.add(aula3); //adiciona objetos

        System.out.println(aulas);

        aulas.remove(aula2); //remove um objeto pelo nome
        aulas.remove(0); //remove um objeto pelo indice
        aulas.remove(aula3); //remove um objeto pelo indice

        System.out.println(aulas);

        aulas.add(aula1); //adiciona objetos
        aulas.add(aula2); //adiciona objetos
        aulas.add(aula3); //adiciona objetos


        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("- Aula: " + aulas.get(i));
        }

        //para cada aula dentro de aulas
        for (String aula : aulas) {
            System.out.println("* Aula: " + aula);
        }

        //para cada aula, dentro de aulas, faça:
        //usado em: paralelismo, mutabilidade
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println(aula);
        });

        aulas.add("Aumentando nosso conhecimento");

        aulas.add("Comentando sobre POO");

        System.out.println(aulas);
        Collections.sort(aulas); //Ordena a ArrayList
        System.out.println("ArrayList ordenada: ");
        System.out.println(aulas);//Imprimindo em ordem alfabética

    }

}
