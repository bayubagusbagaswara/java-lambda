package com.java.lambda;

public class SimpleActionApp {
    public static void main(String[] args) {

        // Versi Anonymous Class
        // langsung membuat implementasi interface dan menggunakann method abstractnya
        // method action() tidak memiliki parameter

        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Bayu Bagus Bagaswara";
            }
        };
        System.out.println("Hasil anonymous class : " + simpleAction.action());

        // Versi Lambda
        // caranya dengan menulis parameter milik method abstract lambda nya
        // Jika method nya tidak punya parameter, maka cukup tulis () dengan parameter kosong
        // Tidak perlu menyebutkan nama method abstract nya
        // Perhatikan return value milik method nya
        // Jika return value berupa String, maka balikan data nya berupa String juga

        SimpleAction simpleAction1 = () -> {
            return "Bayu Bagus Bagaswara";
        };
        System.out.println("Hasil lambda : " + simpleAction1.action());
    }
}
