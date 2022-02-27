package com.java.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ForeachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Bayu", "Bagus", "Bagaswara");

        // get data with foreach biasa
        for (String value : list) {
            System.out.println(value);
        }

        // forEach with Anonymous Class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // kita ganti forEach nya menggunakan Lambda
        // bisa buat lambda nya disimpan ke variabel, atau bahkan bisa langsung buat lambda nya didalam parameter
        // karena lambda sebenarnya adalah object

        Consumer<String> lambda = value -> System.out.println(value);

        // cuma sebenarnya saat bikin lambda jarang banget dibikin variabel untuk value nya
        // biasanya langsung kirim ke parameter
        list.forEach(value -> System.out.println(value));

        // menggunakan method reference lebih simple, tidak perlu bikin lambda value
        list.forEach(System.out::println);

        // Jadi, saat ingin mengambil data dari List bisa menggunakan lambda
        // tanpa harus menggunakan foreach biasa ataupun anonymous class
    }
}

