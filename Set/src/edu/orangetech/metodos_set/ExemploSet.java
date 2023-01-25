package edu.orangetech.metodos_set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) throws Exception {
        // Dada uma lista com sete notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:

        System.out.println("\nCrie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString());
        // Não aparecem os elementos repetidos, ordem aleatória

        System.out.println("\nConfira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5d));

        System.out.println("\nExiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("\nRemova a nota 0.0: ");
        notas.remove(0.0);
        System.out.println(notas.toString());

        System.out.println("\nRemova as notas menores que 7.0: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas.toString());

        System.out.println("\nExiba todas as notas na ordem que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d));
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2.toString());

        System.out.println("\nExiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); //Só possível fazer esse tipo de ordenção pq o método double possui método comparable
        System.out.println(notas3.toString());

        System.out.println("\nApague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto notas está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto notas2 está vazio: " + notas2.isEmpty());
    }
}
