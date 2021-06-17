package com.example.android_doc_implementation.oop_challange;

public class Jantung extends Organ {
    private int rate;

    public Jantung(String nama, String kondisiMedis, int rate) {
        super(nama, kondisiMedis);
        this.rate = rate;
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("detak Jantung: "+ this.getRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
