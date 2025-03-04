package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> names = new LinkedList<>();

        // Eleman ekleme
        names.add(1);
        names.add(2);
        names.add(3);
        names.add(4);


        // Listeyi yazdır
        System.out.println("Bağlı Liste Elemanları: " + names);

        // İlk elemanı ekle (başa ekler)
        names.addLast(8);
        System.out.println("Başa eleman ekleme: " + names);
    }
}