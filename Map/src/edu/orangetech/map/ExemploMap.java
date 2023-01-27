package edu.orangetech.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares2020.values());
        String modeloMenosEficiente = "";
        // Entry retorna um set onde é possível manipular chaves e valores separadamente
        for (Map.Entry<String,Double> entry : carrosPopulares2020.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        }
    }
        

        // System.out.println("Exiba a soma dos consumos: " + soma);
        // System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        // System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        // System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        // System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        // System.out.println("Apague o dicionario de carros: ");
        // System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());


    }
}
