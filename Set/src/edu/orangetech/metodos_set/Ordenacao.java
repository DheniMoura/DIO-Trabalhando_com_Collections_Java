package edu.orangetech.metodos_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ordenacao {
    public static void main(String[] args) {
        /*
         * Dadas as seguintes informações sobre minhas séries favoritas,
         * crie um conjunto e ordene este conjunto exibindo:
         * (nome - gênero - tempo de episódio)
         */

        //  serie1 = nome: peaky blinders, genero: drama, tempoEpisodio: 60
        //  serie2 = nome: dark, genero: drama, tempoEpisodio: 60
        //  serie3 = nome: the office, genero: comedia, tempoEpisodio: 20

        System.out.println("\n--\tExibição em ordem aleatória\t--");
        Set<Serie> minhasSeries1 = new HashSet<>(){{
            add(new Serie("peaky blinders",  "drama", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("the office","comedia", 20));

        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEspisodio());


        System.out.println("\n--\tExibição em ordem de inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("peaky blinders",  "drama", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("the office","comedia", 20));

        }};
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEspisodio());

        System.out.println("\n--\tExibição em ordem natural (tempo de episódio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEspisodio());


        System.out.println("\n--\tExibição em ordem nome/gênero/tempo de episódio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries1); // quando minhasSeries1 for adicinada à minhasSeries4, já será adicionada ordenada pela classe comparatorNomeGeneroTempoEpisodio
        for (Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEspisodio());


        System.out.println("\n--\tExibição em ordem gênero\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGeneroNomeTempoEpisodio());
        minhasSeries5.addAll(minhasSeries1);
        for (Serie serie : minhasSeries5) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEspisodio());

    }
}
