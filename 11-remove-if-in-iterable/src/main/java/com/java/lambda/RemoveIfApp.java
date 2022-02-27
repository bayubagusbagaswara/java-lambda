package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList();
        names.addAll(List.of("Bayu", "Bagus", "Bagaswara"));

        // removeIf with anonymous function
        names.removeIf(new Predicate<String>() {
            public boolean test(String value) {
                // semua value yang panjang nya lebih dari 5 akan di remove
                return value.length() > 5;
            }
        });
        System.out.println(names);

        // removeIf with lambda
        // kalau menggunakan lambda cukup masukkan nama variabelnya
        // tapi tidak bisa menggunakan method reference karena ada tambahan kondisi > 5
        names.removeIf((name) -> {
            return name.length() > 5;
        });
        System.out.println(names);
    }
}
