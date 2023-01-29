package edu.orangetech.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LanceDeDados {
    /*
     * Faça um programa que simule um lançamento de dados.
     * Lance o dado 100 vezes e armazene.
     * Depois, mostre quantas vezes cada valor foi inserido.
     */
    public static void main(String[] args) {

        // Criação de variáveis
        int quantidadeLancamentos = 100;
        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();

        // Lançamentos do dado, valores armazenados na lista valores
        for (int i = 0; i < quantidadeLancamentos; i++) {
            int number = geradorDeLancamento.nextInt(6) + 1;
            valores.add(number);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
            lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }

        System.out.println("Jogando");
        for(int i = 0; i < 3; i++) {
            try {
                Thread.sleep(300);
                System.out.println(".");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("\nValor " + "Quantidade de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }

}
