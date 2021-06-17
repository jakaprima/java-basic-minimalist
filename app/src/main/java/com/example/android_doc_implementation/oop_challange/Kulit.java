package com.example.android_doc_implementation.oop_challange;

public class Kulit extends Organ {
    private String warna;
    private int kehalusan;

    public Kulit(String nama, String kondisiMedis, String warna, int kehalusan) {
        super(nama, kondisiMedis);
        this.warna = warna;
        this.kehalusan = kehalusan;
    }

    public void getDetails(){
        super.getDetails();
        System.out.println("Warna kulit: "+ this.getWarna());
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getKehalusan() {
        return kehalusan;
    }

    public void setKehalusan(int kehalusan) {
        this.kehalusan = kehalusan;
    }
}
