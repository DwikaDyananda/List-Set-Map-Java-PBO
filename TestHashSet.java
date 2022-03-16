package com.dicoding.javafundamental.collection;

import java.util.*;

public class TestHashSet {

    public static void main(String[] args){
        //Menggunakan HashSet (output tidak tentu urutannya)
        Set<String> siswa = new HashSet<>();
        siswa.add("Agus");
        siswa.add("Cita");
        siswa.add("Dika");
        siswa.add("Monju");
        siswa.add("Bagas");
        siswa.add("Evan");

        System.out.println(siswa);
        siswa.remove("Monju");
        //Mengetahui apakah terdapat data dengan nilai atau nama "Ayu" pada Set siswa, true atau false
        System.out.println(siswa.contains("Ayu"));

        for(Iterator iterator = siswa.iterator(); iterator.hasNext();) {
            System.out.println("\t " + iterator.next());
        }
    }
}

