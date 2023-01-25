package edu.orangetech.metodos_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
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


        // System.out.println("--\tExibição em ordem gênero\t--");
        // System.out.println("--\tExibição em ordem tempo de episódio\t--");
    }
}

class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEspisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEspisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEspisodio() {
        return tempoEspisodio;
    }

    @Override
    public String toString() {
        return "{" + 
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEspisodio +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEspisodio.equals(serie.tempoEspisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEspisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEspisodio(), serie.getTempoEspisodio());
        int genero = this.getGenero().compareTo(serie.getGenero());
        if (tempoEpisodio != 0) return tempoEpisodio;
        else if (genero != 0) return genero;

        return this.getNome().compareTo(serie.getNome());
    }

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEspisodio(), s2.getTempoEspisodio());
    }
}
