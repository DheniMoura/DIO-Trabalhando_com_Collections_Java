package edu.orangetech.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

    public static void main(String[] args) throws Exception {
        /*
        Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14,4km/l
        modelo = uno - consumo = 15,6 km/l
        modelo = mobi - consumo = 16,1 km/l
        modelo = hb20 - consumo = 14,5 km/l
        modelo = kwid - consumo = 15,6 km/l
        */

        System.out.println("\nCrie um dicionário e relacione os modelos e seus respectivos consumos: ");
        // Diferentes formas de iniciar um Map quando a ordem não importa
        // HashMap<String, Double> carrosPopulares2020 = new HashMap<>();
        // Map<String, Double> carrosPopulares2021 = Map.of("gol", 14.4,"uno", 15.6,"mobi", 16.1,"hb20", 14.5,"kwid", 15.6);
        Map<String, Double> carrosPopulares2020 = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2020);
        
        System.out.println("\nSubstitua o consumo do gol por 15.2km/l: ");
        // Como não é possível ter duas chaves repetidas, vou inserir uma chave gol com o valor correto
        carrosPopulares2020.put("gol", 15.2);
        System.out.println(carrosPopulares2020);


        System.out.println("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares2020.containsKey("tucson"));


        System.out.println("\n Exiba o concumo do uno: ");
        System.out.println(carrosPopulares2020.get("uno"));


        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares2020.keySet(); // o método keyset retorna um set
        System.out.println(modelos);


        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares2020.values(); // values retorna uma collection de valores
        System.out.println(consumos);


        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares2020.values());
        Set<Map.Entry<String, Double>> entries =  carrosPopulares2020.entrySet();// retorna um set com elementos do tipo set
        String modeloMaisEficiente = ""; // variável de controle
        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares2020.values());
        String modeloMenosEficiente = "";
        // Entry retorna um set onde é possível manipular chaves e valores separadamente
        for (Map.Entry<String,Double> entry : carrosPopulares2020.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        }
    }
        

        System.out.println("\nExiba a soma dos consumos: "); // utilizar o iteretor, pois o retorno do carrospopulares é um collections
        Iterator<Double> iterator = carrosPopulares2020.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);


        System.out.println("\nExiba a média dos consumos deste dicionário de carros: ");
        Double media = soma / carrosPopulares2020.size();
        System.out.println(media);


        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        System.out.println("Antes da remoção:\n" + carrosPopulares2020);
        Iterator<Double> iterator1 = carrosPopulares2020.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Depois da remoção:\n" + carrosPopulares2020);


        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        // Faz a criação com o método LinkedHashMap, muda apenas a implementação
        Map<String, Double> carrosPopulares2020a = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2020a);


        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        // O modelo é a chave, quem ordena a chave é o TreeMap
        Map<String, Double> carrosPopulares2020b = new TreeMap<>(carrosPopulares2020a);
        System.out.println(carrosPopulares2020b.toString());


        System.out.println("\nApague o dicionario de carros. ");
        carrosPopulares2020.clear();


        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares2020.isEmpty());


    }
}
