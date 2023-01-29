package edu.orangetech.map.temperaturas;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    

    public static void main(String[] args) {

        Map<String,Integer> populacaoEstados = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println("\nCriando o dicionário de estados\n" + populacaoEstados);

        populacaoEstados.put("RN", 3534165);
        System.out.println("\nPopulação do estado RN atualizada: \n" + populacaoEstados);

        System.out.println("\nO estado PB está no dicionário?: " + populacaoEstados.containsKey("PB"));
        if (populacaoEstados.containsKey("PB")) {
            System.out.println("Estado PB já está no dicionário");
        } else {
            populacaoEstados.put("PB", 4039277);
        }
        System.out.println("Dicionário de estados atualizado com o estado PB: \n" +populacaoEstados);

        System.out.println("\nExiba a população de PE: " + populacaoEstados.get("PE"));

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstadosOrdenado = new TreeMap<>(populacaoEstados);
        System.out.println(populacaoEstadosOrdenado.toString());

        System.out.println("\nExiba o estado com a menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(populacaoEstados.values());
        String estadoMenosPopulado = "";
        for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)) {
            estadoMenosPopulado = entry.getKey();
            System.out.println("Estado menos populoso: " + estadoMenosPopulado + " - " + menorPopulacao + " habitantes.");
            }
        }

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(populacaoEstados.values());
        String estadoMaisPopulado = "";
        for (Map.Entry<String, Integer> entry : populacaoEstados.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao)) {
            estadoMaisPopulado = entry.getKey();
            System.out.println("Estado menos populoso: " + estadoMaisPopulado + " - " + maiorPopulacao + " habitantes.");
            }
        }

        System.out.println("\nExiba a soma da população desses estados: ");
        Iterator<Integer> iterador1 = populacaoEstados.values().iterator();
        Integer soma = 0;
        while(iterador1.hasNext()) {
            soma += iterador1.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média da população desse dicionário de estados: ");
        Integer media = soma / populacaoEstados.size();
        System.out.println(media);

        System.out.println("\nRemova os estados com a população meor que 4.000.000");
        Iterator<Integer> iterador2 = populacaoEstados.values().iterator();
        while(iterador2.hasNext()) {
            if(iterador2.next() <= 4000000) iterador2.remove();
        }
        System.out.println("Estados com população maior ou igual a 4.000.000:\n" + populacaoEstados);

        System.out.println("\nLimpe o dicionário de estados.");
        populacaoEstados.clear();

        System.out.println("Confira se o dicionário está vazio: " + populacaoEstados.isEmpty());
    }
    
}

/*
System.out.println("\nExiba a soma dos consumos: "); // utilizar o iteretor, pois o retorno do carrospopulares é um collections
        Iterator<Double> iterator = carrosPopulares2020.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

 */