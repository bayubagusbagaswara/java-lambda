package com.java.lambda;

public class NonLazyApp {
    public static void main(String[] args) {

        // misalnya kita ingin parameter method getName() tidak akan dipanggil jika emang kondisinya tidak memenuhi
        // karena secara default di java semua isi function itu akan dijalankan, baru kemudian akan dikirimkan ke parameter
        testScore(60, getName());
    }

    // method testScore()
    public static void testScore(int score, String name) {
        if (score > 80) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            // ini tidak pake parameter name nya
            System.out.println("Coba lagi tahun depan");
        }
    }

    // method getName()
    public static String getName() {
        // ini akan dijalankan dulu, sebelum method getName() ini dikirim ke parameter method testScore()
        // alhasil meskipun di testScore parameter getName tidak digunakan, tapi tetap ditampilkan pada hasil akhirnya
        // oleh karena itu, dengan lambda kita buat parameter name di method testScore menjadi Lazy
        System.out.println("Method getName() dipanggil");
        return "Bayu";
    }
}
