package com.dicoding.javafundamental.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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

        //Dengan LinkedHashMap (output sesuai urutan input)
//        Map<String, Mahasiswa> daftarmhs = new LinkedHashMap<>();
//        daftarmhs.put("210555", new Mahasiswa("Arya", 19));
//        daftarmhs.put("210551", new Mahasiswa("Budi", 18));
//        daftarmhs.put("210553", new Mahasiswa("Juan", 18));
//        daftarmhs.put("210552", new Mahasiswa("Eka", 19));
//        daftarmhs.put("210554", new Mahasiswa("Monica", 18));
//
//        System.out.println(daftarmhs);

        //Dengan TreeMap (output diurut 'key' dari kecil ke besar)
//        Map<String, Mahasiswa> daftarmhs = new TreeMap<>();
//        daftarmhs.put("210555", new Mahasiswa("Arya", 19));
//        daftarmhs.put("210551", new Mahasiswa("Budi", 18));
//        daftarmhs.put("210553", new Mahasiswa("Juan", 18));
//        daftarmhs.put("210552", new Mahasiswa("Eka", 19));
//        daftarmhs.put("210554", new Mahasiswa("Monica", 18));
//
//        System.out.println(daftarmhs);

    }
}
