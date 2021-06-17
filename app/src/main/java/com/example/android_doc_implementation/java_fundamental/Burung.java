package com.example.android_doc_implementation.java_fundamental;

// inheritance (mewarisi)
public class Burung extends Binatang {
    private int sayap;

    public Burung(String name, String warna, int kaki, boolean punya_pengalaman, int sayap) {
        super(name, warna, kaki, punya_pengalaman);
        this.sayap = sayap;
    }

    public void makan(String makanan){
        super.makan(makanan);
        System.out.println("Burung selesai makan");
    }

    public void terbang() {
        System.out.println(this.getName() + " sedang terbang");
    }

    // polymorphis
    public void terbang(int kecepatan) {
        System.out.println("Kecepatan "+ this.getName() + " adalah: "+ kecepatan);
    }

    public int getSayap() {
        return sayap;
    }

    public void setSayap(int sayap) {
        this.sayap = sayap;
    }
}
