package edu.orangetech.metodos_set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainLinguagemFavorita {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>();
        linguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        linguagensFavoritas.add(new LinguagemFavorita("PHP", 1994, "Eclipse"));

        // Precisa que tenha sido utilizado o LinkedHashSet na criação do Set
        System.out.println("\nExibir o conjunto por ordem de inserção: ");
        System.out.println(linguagensFavoritas.toString());

        // Para exibir por ordem natural precisa implementar o Comparable na classe, também precisa que o metodo compareTo retorando uma comparação da variávvel desejada
        System.out.println("\nExibir o conjunto por ordem natural(Nome): ");
        Set<LinguagemFavorita> ordemNatural = new TreeSet<>(linguagensFavoritas);
        System.out.println(ordemNatural.toString());

        // Precisa criar uma classe com método de comparação por IDE
        System.out.println("\nExibir o conjunto por ordem de IDE: ");
        Set<LinguagemFavorita> ordemIde = new TreeSet<>(new ComparatorIDE());
        ordemIde.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : ordemIde) {
            System.out.println(linguagemFavorita);
        }

        // Precisa de uma classe com método de comparação por ano e nome
        System.out.println("\nExibir o conjunto por ano de criação e nome: ");
        Set<LinguagemFavorita> ordemAnoDeCriacaoNome = new TreeSet<>(new ComparatorAnoCriacaoNome());
        ordemAnoDeCriacaoNome.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : ordemIde) {
            System.out.println(linguagemFavorita);
        }


        System.out.println("\nExibir o conjunto por nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemFavoritas2.addAll(linguagensFavoritas);
        System.out.println(linguagemFavoritas2.toString());
    }
}
