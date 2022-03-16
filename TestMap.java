package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.Map;


public class TestMap {

    public static void main(String[] args){
        //Map dengan class Mahasiswa
        Map<String, Mahasiswa> daftarmhs = new HashMap<>();
        daftarmhs.put("210555", new Mahasiswa("Arya", 19));
        daftarmhs.put("210551", new Mahasiswa("Budi", 18));
        daftarmhs.put("210553", new Mahasiswa("Juan", 18));
        daftarmhs.put("210552", new Mahasiswa("Eka", 19));
        daftarmhs.put("210554", new Mahasiswa("Monica", 18));

        System.out.println("Size dari daftar mahasiswa = " + daftarmhs.size());
        System.out.println(daftarmhs);
        System.out.println();

        daftarmhs.remove("210551");
        System.out.println("Size dari daftar mahasiswa = " + daftarmhs.size());
        System.out.println(daftarmhs);
        System.out.println(daftarmhs.get("210555"));
        System.out.println();

        for (String key : daftarmhs.keySet()) {
            System.out.println("\t " + key + " : " + daftarmhs.get(key));
        }

    }
}
