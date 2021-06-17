package com.example.android_doc_implementation.oop_challange;

public class Mata extends Organ {
    private String warna;
    private boolean isTerbuka;

    public Mata(String nama, String kondisiMedis, String warna, boolean isTerbuka) {
        super(nama, kondisiMedis);
        this.warna = warna;
        this.isTerbuka = isTerbuka;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Warna mata: "+ this.getWarna());
    }

    public void buka(){
        this.setTerbuka(true);
        System.out.println(this.getNama()+ " Terbuka");
    }

    public void tutup(){
        this.setTerbuka(false);
        System.out.println(this.getNama()+ " Tertutup");
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTerbuka() {
        return isTerbuka;
    }

    public void setTerbuka(boolean terbuka) {
        isTerbuka = terbuka;
    }
}
