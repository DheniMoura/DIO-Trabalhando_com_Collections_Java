package edu.orangetech.metodos_set;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    
    String nome;
    Integer anoCriacao;
    String ide;
    
    public String getNome() {
        return nome;
    }
    public Integer getAnoCriacao() {
        return anoCriacao;
    }
    public String getIde() {
        return ide;
    }
    public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nAno de criação: " + anoCriacao + "\nIDE: " + ide;
    }
    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }


}

class ComparatorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }    
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.anoCriacao, l2.anoCriacao);
        if(anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);
    }

}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}