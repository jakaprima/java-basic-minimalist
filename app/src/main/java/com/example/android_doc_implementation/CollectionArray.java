package com.example.android_doc_implementation;
import com.example.android_doc_implementation.collection.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CollectionArray {
    public static void main(String[] args){
        //        String[] kelompok1 = {"prima", "saja", "dot", "com"};
        //        System.out.println(kelompok1[3]);
        //        // Error java.lang.ArrayIndexOutOfBoundsException: 4
        //        // kelompok1[4] = "jaka";
        //
        //        String[] kelompokBaru = new String[6];
        //        for (int i=0; i < kelompok1.length; i++){
        //            kelompokBaru[i] = kelompok1[i];
        //        }
        //        kelompokBaru[4] = "jaka";
        //        for (int x=0; x < kelompokBaru.length; x++){
        //            System.out.println("array value "+ kelompokBaru[x]);
        //        }
        //        System.out.println("kelompok baru"+ kelompokBaru.toString());

        ArrayList<String> kelompok1 = new ArrayList<>();
        kelompok1.add("prima");
        kelompok1.add("saja");
        System.out.println(kelompok1.indexOf("prima"));
        System.out.println(kelompok1.get(0));
        // array length
        System.out.println(kelompok1.size());
        // kelompok1.clear();
        // System.out.println(kelompok1.size()); // 0

        // kelompok1.remove("prima");
        System.out.println(kelompok1.get(0)); // saja
        System.out.println(kelompok1.contains("saja"));
        // kelompok1.remove("saja");
        System.out.println(kelompok1.isEmpty());

        int i = 0;
        while (i < kelompok1.size()){
            System.out.println(kelompok1.get(i));
            i++;
        }

        Map<String, String> listData = new HashMap<>();
        listData.put("email", "admin@primasaja.com");
        listData.put("name", "jaka");
        System.out.println(listData.get("email"));
        System.out.println(listData.size());
        listData.remove("email");
        System.out.println(listData.containsKey("email")); // false
        System.out.println(listData.containsValue("name")); // true

        ArrayList<Murid> murids = new ArrayList<>();
        murids.add(new Murid("jaka", 1));
        murids.add(new Murid("prima", 2));

        for (Murid murid: murids){
            System.out.println("murid: "+ murid.getNama());
        }

    }
}
