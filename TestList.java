package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args){
        List<String> bunga = new ArrayList<>();
        bunga.add("Mawar");
        bunga.add("Melati");
        bunga.add("Lili");
        bunga.add(2, "Teratai");
        bunga.add("Teratai");
        bunga.add("Matahari");
        bunga.add("Kamboja");
        bunga.add("Cempaka");

        System.out.println(bunga);

        bunga.remove(1);
        bunga.set(6, "Kembang Sepatu");
        System.out.println(bunga);
        System.out.println(bunga.subList(2,4));  //Mencetak data dari index 2 dan 4

        List<String> nama = new ArrayList<>();
        nama.add("Dinda");
        nama.add("Ayu");
        nama.add("Sukma");
        nama.add("Nanda");

        System.out.println(nama);
        System.out.println();
        System.out.println("Index ke-1 pada list nama adalah " + nama.get(1));
        System.out.println();

        //Perulangan untuk mengecek data yang sama (duplikat) pada List bunga
        for (int i=0; i<bunga.size(); i++) {
            for (int j=i+1; j<bunga.size(); j++) {
                if (bunga.get(i).equals(bunga.get(j))) {
                    System.out.println("Data yang duplikat = " + bunga.get(j));
                }
            }
        }
        //Pengecekan kondisi apakah index 1 dan 3 memiliki nilai yang sama atau tidak
        if(bunga.get(1).equals(bunga.get(3))){
            System.out.println("Bunga pada index 1 dan 3 adalah sama = bunga " + bunga.get(1) + " dan " + bunga.get(3));
        }else{
            System.out.println("Tidak sama");
        }

        System.out.println();
        //Menggabungkan data List bunga dengan List nama menggunakan .addAll (tipe data yang sama)
        bunga.addAll(nama);
        System.out.println(bunga);
        System.out.println(nama);
        System.out.println();

        int i;
        int j = 0;
        for(i = 0; i<nama.size(); i++){
            System.out.println(nama.get(i) + " suka dengan bunga " + bunga.get(j));
            j++;
        }

        //Menghapus data pada List nama
        nama.clear();
        System.out.println();
        System.out.println(nama);
        System.out.println("Size pada list nama = " + nama.size());

    }
}
