package com.example.android_doc_implementation.java_fundamental;

public class Anjing {
    private String name;
    private String warna;
    private int kaki;
    private boolean punya_pengalaman;

    public Anjing(String name, String warna, int kaki, boolean punya_pengalaman) {
        this.name = name;
        this.warna = warna;
        this.kaki = kaki;
        this.punya_pengalaman = punya_pengalaman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public boolean isPunya_pengalaman() {
        return punya_pengalaman;
    }

    public void setPunya_pengalaman(boolean punya_pengalaman) {
        this.punya_pengalaman = punya_pengalaman;
    }

    public void makan(String makanan){
        System.out.println("Sedang makan "+ makanan);
    }
}
