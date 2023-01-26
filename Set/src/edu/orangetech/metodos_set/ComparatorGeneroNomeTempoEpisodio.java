package edu.orangetech.metodos_set;

import java.util.Comparator;

public class ComparatorGeneroNomeTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        return Integer.compare(s1.getTempoEspisodio(), s2.getTempoEspisodio());
    }
}
