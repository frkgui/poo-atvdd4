package com.atividades.poo.primeira;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<>();

        minhaLista.add(50);
        minhaLista.add(30);
        minhaLista.add(20);

        int somaDaLista = somarListas(minhaLista);

        System.out.println(somaDaLista);

    }

    public static int somarListas(List<Integer> listaDeNumeros){

        Stream<Integer> streamLista = listaDeNumeros.stream();

        Stream<Integer> streamFilterPares = streamLista.filter(numero -> numero % 2 == 0);

        int soma = streamFilterPares.reduce(0,(a,b)-> a+b);

        return soma ;

    }



}
