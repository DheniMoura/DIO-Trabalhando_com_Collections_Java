package edu.orangetech.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
      List<String> numerosAleatorios =
               Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

      System.out.println("\nImprima todos os elementos dessa lista de String: ");
    //   Utilizando o foreach e método lambda
      numerosAleatorios.stream().forEach(System.out::println);


      System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
      // Operação collect, utilizada para pegar o elementos;
      // Lembrar qu eo set não aceita elementos repetidos
      numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
      // Mesma ação, mas agora salvando o collect em uma variável
      Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
      System.out.println(collectSet);


      System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
      // Map para transformar alist de string em uma list de inteiros
      // Vale lembrar que o stream não altera a list orginal*
      List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        .map(t -> Integer.parseInt(t))
        .collect(Collectors.toList());
      System.out.println(numerosAleatoriosInteger);
      

      System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
      List<Integer> listParesMaioresQueDois = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(t -> (t %2 == 0 && t > 2)) .collect(Collectors.toList());
      System.out.println(listParesMaioresQueDois);


      System.out.println("Mostre a média dos números: ");
      numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()
        .ifPresent(System.out::println);


      System.out.println("Remova os valores ímpares: ");
      // Precisa trabalhar com números inteiros
      numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
      System.out.println(numerosAleatoriosInteger);


      // System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
      // System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
      // System.out.print("Mostre o menor valor da lista: ");
      // System.out.print("Mostre o maior valor da lista: ");
      // System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

      // System.out.println("Mostre a lista na ordem númerica: ");
      // System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
      //        dica: collect(Collectors.groupingBy(new Function())
    }
}
