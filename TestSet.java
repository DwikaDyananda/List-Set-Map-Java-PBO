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

        //Menggunakan HashSet (output tidak tentu urutannya)
        Set<String> siswa = new HashSet<>();
        siswa.add("Agus");
        siswa.add("Cita");
        siswa.add("Dika");
        siswa.add("Monju");
        siswa.add("Bagas");
        siswa.add("Evan");

        System.out.println();
        System.out.println(siswa);
        siswa.remove("Monju");
        //Mengecek apakah terdapat data dengan nilai atau nama "Ayu" pada Set siswa
        System.out.println(siswa.contains("Ayu"));

        for(Iterator iterator = siswa.iterator(); iterator.hasNext();) {
            System.out.println("\t " + iterator.next());
        }

        //Menggunakan LinkedHashSet (output sesuai urutan input)
        Set<String> tatasurya = new LinkedHashSet<>();
        tatasurya.add("Matahari");
        tatasurya.add("Merkurius");
        tatasurya.add("Venus");
        tatasurya.add("Bumi");
        tatasurya.add("Mars");
        tatasurya.add("Jupiter");
        tatasurya.add("Saturnus");
        tatasurya.add("Uranus");
        tatasurya.add("Neptunus");

        System.out.println();
        System.out.println(tatasurya);
        System.out.println("Size = " + tatasurya.size());

        //Menghapus data pada Set bilangan
        bilangan.clear();
        System.out.println();
        System.out.println(bilangan);
        System.out.println("Size setelah clear = " + bilangan.size());

    }
}
