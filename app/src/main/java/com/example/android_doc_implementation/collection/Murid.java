package com.example.android_doc_implementation.collection;

public class Murid{
    private String nama;
    private int id;

    public Murid(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
