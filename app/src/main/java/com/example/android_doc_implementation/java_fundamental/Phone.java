package com.example.android_doc_implementation.java_fundamental;

//public class Phone {
//    String name;
//    int screenSize;
//    int memoryRam;
//    int camera;
//
//    public void playMusic(String trackName){
//        System.out.println("Playing "+ trackName);
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    // klik kanan -> generate getter and setter
//    public int getCamera() {
//        return camera;
//    }
//
//    public void setCamera(int camera) {
//        this.camera = camera;
//    }
//
//    // generate getter and setter untuk modifikasi jika menggunakan private attribute
//}

// contoh dengan private dan construct
public class Phone {
    private String name;
    private int screenSize;
    private int memoryRam;
    private int camera;

    // constructor
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    // constructor bisa 2 ini yang disebut polymorphis
    // Polymorphism means "many forms", and it occurs when we have many classes that are related
    // to each other by inheritance.
    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void playMusic(String trackName){
        System.out.println("Playing "+ trackName);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // klik kanan -> generate getter and setter
    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    // generate getter and setter untuk modifikasi jika menggunakan private attribute
}
