package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArraysLists", 21);
        Aula a2 = new Aula("Listas de objetos", 35);
        Aula a3 = new Aula("Relacionamento de listas e de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas);

        String s1 = "isabela";
        String s2 = "fagundes";
        s1.compareTo(s2);
        //devolve -1 se s1 for "menor" que o outro (ordem alfabética)
        //devolve 1 se s1 for "maior" que o outro (ordem alfabética)
        //devolve 0 se estão no mesmo patamar

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        //Ordena a lista de Aulas, pelo tempo de cada Aula
    }

}
