package com.example.android_doc_implementation;
import com.example.android_doc_implementation.oop_challange.*;

import java.util.Scanner;

public class OopChallange {
    public static void main(String[] args){
        // The class below should not be inherited by other classes. Add the correct modifier:
        //final class MyClass

        Pasien pasienObj = new Pasien("Rudi", 27,
                new Mata("mata kiri", "rabun jauh", "coklat", true),
                new Mata("mata kanan", "normal", "coklat", true),
                new Jantung("jantung", "normal", 120),
                new Perut("perut", "normal", false),
                new Kulit("kulit", "normal", "coklat", 100));

        System.out.print("Masukkan nama Anda sebagai Pasien: ");
        Scanner scanner = new Scanner(System.in);
        String nama_pasien = scanner.next();
        pasienObj.setNama(nama_pasien);

        System.out.print("Masukkan umur Anda sebagai Pasien: ");
        int umur = scanner.nextInt();
        pasienObj.setUmur(umur);

        System.out.println("Selamat Datang di Aplikasi Checkup PrimaSaja.com");
        System.out.println("Data diri Anda:");
        System.out.println("Nama:  "+ pasienObj.getNama());
        System.out.println("Umur: "+ pasienObj.getUmur());

        boolean selesaiPemeriksaan = false;
        while(!selesaiPemeriksaan){
            System.out.println("Pilih organ yang akan diperiksa: "+
                    "\n\t1. Mata Kiri"+
                    "\n\t2. Mata Kanan"+
                    "\n\t3. Jantung"+
                    "\n\t4. Perut"+
                    "\n\t5. Kulit"+
                    "\n\telse. Quit"
                    );
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            switch (pilihan){
                case 1:
                    pasienObj.getMataKiri().getDetails();
                    if (pasienObj.getMataKiri().isTerbuka()){
                        System.out.println(pasienObj.getMataKiri().getNama()+ " Anda masih terbuka tutup dahulu");
                        System.out.println("Apakah anda akan menutup?"+
                                "\n\t1. Iya"+
                                "\n\t2. Tidak");
                        if (scanner.nextInt() == 1) {
                            pasienObj.getMataKiri().tutup();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println(pasienObj.getMataKiri().getNama()+ " Anda masih tertutup buka dahulu");
                        System.out.println("Apakah anda akan membuka?"+
                                "\n\t1. Iya"+
                                "\n\t2. Tidak");
                        if (scanner.nextInt() == 1) {
                            pasienObj.getMataKiri().buka();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    pasienObj.getMataKanan().getDetails();
                    if (pasienObj.getMataKanan().isTerbuka()){
                        System.out.println(pasienObj.getMataKanan().getNama()+ " Anda masih terbuka tutup dahulu");
                        System.out.println("Apakah anda akan menutup?"+
                                "\n\t1. Iya"+
                                "\n\t2. Tidak");
                        if (scanner.nextInt() == 1) {
                            pasienObj.getMataKanan().tutup();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println(pasienObj.getMataKanan().getNama()+ " Anda masih tertutup buka dahulu");
                        System.out.println("Apakah anda akan membuka?"+
                                "\n\t1. Iya"+
                                "\n\t2. Tidak");
                        if (scanner.nextInt() == 1) {
                            pasienObj.getMataKanan().buka();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    pasienObj.getJantung().getDetails();
                    System.out.println("Ganti rate detak jantung");
                    if (scanner.nextInt() == 1){
                        System.out.println("masukkan rate detak jantung baru: ");
                        int rateJantungBaru = scanner.nextInt();
                        pasienObj.getJantung().setRate(rateJantungBaru);
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    pasienObj.getPerut().getDetails();
                    System.out.println("Perut anda saat ini: "+ pasienObj.getPerut().kondisiPerut());
                    break;
                case 5:
                    pasienObj.getKulit().getDetails();
                    break;
                default:
                    selesaiPemeriksaan = true;
                    break;
            }
        }



    }
}
