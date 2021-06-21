package com.example.android_doc_implementation.java_fundamental;

public class TestClass {
    public static String nama;
    public int umur;
    private int umur_private;
    private String nama_private;

    public TestClass(int umur) {
        this.umur = umur;
    }

    public static void testMethodPublicStatic(){
        System.out.println("PRINTT"+ nama);
        // error this in static
        // this.testMethodPublic();

        // ga bisa dipanggil di static
        // testMethodPublic();

        // error call non-static attribute
        // return umur;
    }

    public void testMethodPublic(){
        testMethodPublicStatic();
        System.out.println(this);
        System.out.println(umur);
    }

    public static String getNama() {
        return nama;
    }

    public static void setName(String nama) {
        TestClass.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public class TestInnerClassPublic {

    }

    private class TestInnerClassPrivate {
        private String nama_private_class;

        public TestInnerClassPrivate(String nama_private_class) {
            this.nama_private_class = nama_private_class;
        }

        private void testInnerClassPrivateMethod(){
            System.out.println("umur dalam private class"+ umur_private);
            System.out.println(nama);
        }
    }
}
