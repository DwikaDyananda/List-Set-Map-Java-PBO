package com.dicoding.javafundamental.collection;

import java.util.*;

public class TestSet {

    public static void main(String[] args){
        //Menggunakan TreeSet (output diurut dari nilai terkecil ke terbesar
        Set<Integer> bilangan = new TreeSet<>();
        bilangan.add(10);
        bilangan.add(4);
        bilangan.add(8);
        bilangan.add(1);
        bilangan.add(10);

        System.out.println(bilangan);
        //Melihat size dari Set bilangan
        System.out.println("Size dari Set Bilangan adalah " + bilangan.size());

        //Menghapus data 1
        bilangan.remove(1);
        System.out.println(bilangan);
        System.out.println("Size dari Set Bilangan sekarang adalah " + bilangan.size());

        for(Integer angka : bilangan){
            System.out.println("\t" + angka);
        }
    }
}
