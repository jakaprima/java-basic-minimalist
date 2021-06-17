package com.example.android_doc_implementation.oop_challange;

public class Perut extends Organ {
    private boolean isKosong;

    public Perut(String nama, String kondisiMedis, boolean isKosong) {
        super(nama, kondisiMedis);
        this.isKosong = isKosong;
    }

    public void digest(){
        System.out.println("digesting begin...");
    }

    public void getDetails(){
        super.getDetails();
        if (this.isKosong()){
            System.out.println("Perut kosong harus diberi makan");
        } else{
            System.out.println("Perut sudah terisi");
        }
    }

    public boolean isKosong() {
        return isKosong;
    }

    public void setKosong(boolean kosong) {
        isKosong = kosong;
    }

    public String kondisiPerut(){
        if (this.isKosong()){
            return "perut anda kosong";
        }else {
            return "perut anda terisi";
        }
    }
}
