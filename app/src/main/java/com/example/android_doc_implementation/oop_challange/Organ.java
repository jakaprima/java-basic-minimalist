package com.example.android_doc_implementation.oop_challange;

public class Organ {
    private String nama;
    private String kondisiMedis;

    public Organ(String nama, String kondisiMedis) {
        this.nama = nama;
        this.kondisiMedis = kondisiMedis;
    }

    public void getDetails(){
        System.out.println("Nama organ:"+ this.getNama());
        System.out.println("Kondisi medis: "+ this.getKondisiMedis());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKondisiMedis() {
        return kondisiMedis;
    }

    public void setKondisiMedis(String kondisiMedis) {
        this.kondisiMedis = kondisiMedis;
    }
}
