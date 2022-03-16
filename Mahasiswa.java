package com.dicoding.javafundamental.collection;

class Mahasiswa {

    private String nama;
    private Integer umur;

    public Mahasiswa(String nama, Integer umur){
        this.nama=nama;
        this.umur=umur;
    }

    @Override
    public String toString() {
        return "Nama mahasiswa = " + nama + " (" + umur + " tahun)";
    }
}
