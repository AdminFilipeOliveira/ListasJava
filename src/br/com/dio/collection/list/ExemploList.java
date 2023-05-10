package br.com.dio.collection.list;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(4.0);
        notas.add(6.0);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(7.5);
        notas.add(7.0);
        notas.add(6.9);
        System.out.println(notas.toString());
        System.out.println(" Exiba a posicao da nota 5.0 : " + notas.indexOf(5d));
        System.out.println(" Adicione a lista a nota 9.4 na posição 4: ");
        notas.add(4,9.4);
        System.out.println(notas);
        System.out.println("Subestitua a nota 5.0 pela nota 10.2: ");
        notas.set(notas.indexOf(5d),10.2);
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 esta na lista: "+ notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: "+ soma);
        System.out.println("Exiba a media nas notas; " + (soma/notas.size()));
        System.out.println("Remova a nota 0:  ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        //notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista esta vazia; " + notas.isEmpty());
        LinkedList<Double> notas2 = new LinkedList<Double>(notas);
        System.out.println(notas2);
        System.out.println(notas);
        notas2.add(0,10d);
        notas.add(5,10d);
        System.out.println(" Exiba a posicao da primeira nota da lista notas2 : " + notas2.get(0));
        notas2.remove(0);
        System.out.println("Primeira nota apagada; notas2-"+notas2);
        System.out.println(notas);
        System.out.println(notas2);

    }
}
