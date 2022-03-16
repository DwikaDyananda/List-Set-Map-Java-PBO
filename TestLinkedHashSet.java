package com.dicoding.javafundamental.collection;

import java.util.*;

public class TestLinkedHashSet {

    public static void main(String[] args){
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

    }
}

