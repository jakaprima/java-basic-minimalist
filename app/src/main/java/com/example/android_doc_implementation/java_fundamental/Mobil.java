package com.example.android_doc_implementation.java_fundamental;


public class Mobil {
    private String nama;
    private int pintu;
    private String warna;
    private Mesin mesin;

    public Mobil(String nama, int pintu, String warna, Mesin mesin) {
        this.nama = nama;
        this.pintu = pintu;
        this.warna = warna;
        this.mesin = mesin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
}
