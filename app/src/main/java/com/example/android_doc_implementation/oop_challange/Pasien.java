package com.example.android_doc_implementation.oop_challange;

public class Pasien {
    private String nama;
    private int umur;
    private Mata mataKiri;
    private Mata mataKanan;
    private Jantung jantung;
    private Perut perut;
    private Kulit kulit;

    public Pasien(String nama, int umur, Mata mataKiri, Mata mataKanan, Jantung jantung, Perut perut, Kulit kulit) {
        this.nama = nama;
        this.umur = umur;
        this.mataKiri = mataKiri;
        this.mataKanan = mataKanan;
        this.jantung = jantung;
        this.perut = perut;
        this.kulit = kulit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Mata getMataKiri() {
        return mataKiri;
    }

    public void setMataKiri(Mata mataKiri) {
        this.mataKiri = mataKiri;
    }

    public Mata getMataKanan() {
        return mataKanan;
    }

    public void setMataKanan(Mata mataKanan) {
        this.mataKanan = mataKanan;
    }

    public Jantung getJantung() {
        return jantung;
    }

    public void setJantung(Jantung jantung) {
        this.jantung = jantung;
    }

    public Perut getPerut() {
        return perut;
    }

    public void setPerut(Perut perut) {
        this.perut = perut;
    }

    public Kulit getKulit() {
        return kulit;
    }

    public void setKulit(Kulit kulit) {
        this.kulit = kulit;
    }
}
