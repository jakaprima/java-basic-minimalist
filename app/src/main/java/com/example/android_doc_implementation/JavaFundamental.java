package com.example.android_doc_implementation;
//import com.example.android_doc_implementation.java_fundamental.Phone;
import com.example.android_doc_implementation.java_fundamental.*;

// to run klik kanan pilih run with covarage
public class JavaFundamental {
    // for OOP 1
    int x = 5;

    public static void main(String[] args) {
        //        learn episode 3 (java fundamental)
        //        System.out.println("Hello");
        //        System.out.print("hello");
        //        int number = -5;
        //        long intLong = 5;
        //        double intDouble = 4.5;
        //        float intFloat = (float) 4.5;
        //        // char karakter = 'A';
        //        char karakter = '\u00A9';
        //        String nama = "jaka";
        //        Boolean boleanSaya = false;
        //
        //        int a = 5;
        //        int b = 6;
        //        // int jawaban = a + b;
        //        // int jawaban = a * b;
        //        // int jawaban = a / b;
        //        // int jawaban = a % b;
        //
        //        String nama1 = "jaka";
        //        String nama2 = "prima";
        //        String namaLengkap = nama1 + nama2;
        //
        //        int c = 5;
        //        // c += 2; // c = c + 2
        //        // c++; // c = c + 1
        //
        //        int d = 1;
        //        int e = 2;
        //        boolean jawaban1 = d <= e;
        //        boolean jawaban2 = d==1 || e==2;
        //        if (jawaban2){
        //            System.out.println("benar");
        //        }else{
        //            System.out.println("salah");
        //        }
        //
        //        switch (d){
        //            case 1:
        //                System.out.println("case 1");
        //                break;
        //            case 2:
        //                System.out.println("case 2");
        //                break;
        //            default:
        //                System.out.println(("default"));
        //                break;
        //        }
        //
        //        int f = 5;
        //        for (int i=0; i < f; i++){
        //            System.out.println("halo" + i);
        //        }
        //
        //        while (f < 10){
        //            f++;
        //            if (f==8){
        //                // jump to next loop
        //                continue;
        //            }
        //            System.out.println("while loop" + f);
        //        }
        //
        //        do {
        //            System.out.println("do while");
        //        }while (f < 5);
        //
        //        // System.out.println("Masukkan nomor : ");
        //        // Scanner scanner = new Scanner(System.in);
        //        // int answer = scanner.nextInt();
        //        // System.out.println("Answer was" + answer);
        //
        //        Random random = new Random();
        //        int number2 = random.nextInt();

        //        // Game
        //        System.out.println("Selamat datang di PrimaSaja Game");
        //        System.out.println("boleh saya tahu nama anda?");
        //        Scanner scanner = new Scanner(System.in);
        //        String name = scanner.next();
        //        System.out.println("Halo "+ name);
        //        System.out.println("Bisakah kita mulai?");
        //        System.out.println("\t1. Yes");
        //        System.out.println("\t2. No");
        //        int beginAnswer = scanner.nextInt();
        //
        //        while (beginAnswer != 1) {
        //            System.out.println("Bisakah kita mulai?");
        //            System.out.println("\t1. Yes");
        //            System.out.println("\t2. No");
        //            beginAnswer = scanner.nextInt();
        //        }
        //
        //        Random random = new Random();
        //        int jawaban = random.nextInt(20) + 1;
        //        System.out.println("Mohon guess/Tebak Nomor: ");
        //        int userInput = scanner.nextInt();
        //        int timeTried = 0;
        //        boolean hasWon = false;
        //        boolean shouldFinish = false;
        //
        //        while (!shouldFinish){
        //            timeTried++;
        //            if (timeTried < 5) {
        //                if (userInput == jawaban){
        //                    hasWon = true;
        //                    shouldFinish = true;
        //                } else if (userInput > jawaban){
        //                    System.out.println("tebakan salah, jawaban harusnya lebih kecil");
        //                    userInput = scanner.nextInt();
        //                } else{
        //                    System.out.println("tebakan salah, jawaban harusnya lebih besar");
        //                    userInput = scanner.nextInt();
        //                }
        //            } else {
        //                shouldFinish = true;
        //            }
        //        }
        //
        //        if (hasWon){
        //            System.out.println("Selamat Anda Menang pada tebakan ke "+ timeTried);
        //        } else{
        //            System.out.println("Game Over, Anda berusaha mencoba sebanyak: "+ timeTried);
        //            System.out.println("Anda kalah jawaban yang benar adalah: "+ jawaban);
        //        }

        //        // Simple Array
        //        // cara 1
        //        String[] murid = new String[5];
        //        murid[1] = "budi";
        //        murid[0] = "agus";
        //        murid[2] = "lala";
        //        System.out.println(murid[0]);
        //
        //        // cara 2
        //        String[] karyawan = {"bani", "adam"};
        //        int[] nomor = {1, 2, 3, 4, 5, 6};
        //
        //        System.out.println("Masukkan nama anda: ");
        //        Scanner scanner = new Scanner(System.in);
        //        String name = scanner.next();
        //
        //        for (int i=0; i<nomor.length; i++) {
        //            // cara umum di bahasa lain
        //            //            if (name == karyawan[i]){
        //            //                System.out.println("nama anda di temukan dalam list");
        //            //            }
        //            // string bukan lah string type tapi class jadi dia punya method
        //            if (name.equals(karyawan[i])) {
        //                System.out.println("nama anda ditemukan di list");
        //            }
        //            System.out.println(nomor[i]);
        //        }

        // OOP 1
        // tanpa constructor
        //        Phone iPhoneObj = new Phone();
        //        iPhoneObj.name = "iPhone 12";
        //        System.out.println(iPhoneObj.name);
        //        iPhoneObj.memoryRam = 4;
        //        iPhoneObj.camera = 12;
        //        iPhoneObj.playMusic("Naruto Opening");
        //        iPhoneObj.playMusic("Boruto Opening");
        //        iPhoneObj.setName("iPhone 11");
        //        iPhoneObj.getName();
        // OOP 1
        // dengan constructor private attribute
        Phone iPhoneObj = new Phone("Iphone 11", 5, 4, 12);
        // error modifikasi seperti ini
        // iPhoneObj.name = "iPhone 12";
        iPhoneObj.setName("iPhone 12");
        System.out.println(iPhoneObj.getName());
        iPhoneObj.playMusic("Naruto Opening");
        iPhoneObj.playMusic("Boruto Opening");
        iPhoneObj.setName("iPhone 11");
        iPhoneObj.getName();

        Phone xiomiObj = new Phone("Xiaomi Redmi Note 11", 4);

    }
}
