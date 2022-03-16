package com.dicoding.javafundamental.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args){
        //Dengan TreeMap (output diurut 'key' dari kecil ke besar)
        Map<String, Mahasiswa> daftarmhs = new TreeMap<>();
        daftarmhs.put("210555", new Mahasiswa("Arya", 19));
        daftarmhs.put("210551", new Mahasiswa("Budi", 18));
        daftarmhs.put("210553", new Mahasiswa("Juan", 18));
        daftarmhs.put("210552", new Mahasiswa("Eka", 19));
        daftarmhs.put("210554", new Mahasiswa("Monica", 18));

        System.out.println(daftarmhs);

    }
}
