package com.java.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForeachMapApp {
    public static void main(String[] args) {

        // forEach nya menggunakan BiConsumer artinya memiliki 2 parameter yakni Key dan Value

        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Bayu");
        map.put("middle_name", "Bagus");
        map.put("last_name", "Bagaswara");

        // ambil data menggunakan for loop biasa
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // ambil data menggunakan forEach Anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });

        // ambil data menggunakan foreach cukup dengan lambda
        // cukup parameter nya ditulis sesuai tipe data key dan value di map nya
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
