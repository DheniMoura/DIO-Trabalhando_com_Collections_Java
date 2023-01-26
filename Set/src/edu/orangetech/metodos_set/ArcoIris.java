package edu.orangetech.metodos_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class ArcoIris {
    
    public static void main(String[] args) {
        // Crie um conjunto contendo as cores do arco-íris
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);


        System.out.println("\n--\tExiba todas as cores uma abaixo da outra\t--");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }


        System.out.println("\n--\tExiba a quantidade de cores que o arco-íris tem\t--");
        System.out.println("O arco-iris tem: "+ (coresArcoIris.size()) +" cores.");


        System.out.println("\n--\tExiba as cores em ordem alfabética (natural)\t--");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);


        System.out.println("\n--\tExiba as cores na ordem inversa da que foi informada\t--");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta","anil","azul","verde","amarelo","laranja","vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisInversa = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisInversa);
        System.out.println(coresArcoIrisInversa);

        System.out.println("\n--\tExiba todas as cores que começam com a letra ”v”\t--");
        for (String cor : coresArcoIris2) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\n--\tRemova todas as cores que não começam com a letra “v”\t--");
        Iterator<String> iterator2 = coresArcoIris2.iterator();
        while(iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris2);

        
        System.out.println("\n--\tLimpe o conjunto\t--");
        coresArcoIris2.clear();

        System.out.println("--\tConfira se o conjunto está vazio\t--");
        System.out.println("Conjunto limpo: " + coresArcoIris2.isEmpty());
    }
    
}
