package com.java.lambda;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {

        // saat memanggil function testScore, maka gunakan lambda untuk memanggil getName agar parameterya Lazy

        testScore(60, () -> {
            return getName();
        });
    }

    // pake supplier, karena supplier tidak menerima sebuah parameter untuk menjalankan methodnya

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Bayu";
    }
}
