package edu.orangetech.metodos_set;

import java.util.Objects;

public class Serie implements Comparable <Serie>{
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
