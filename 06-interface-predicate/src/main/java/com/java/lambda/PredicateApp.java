package com.java.lambda;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        // Predicate memiliki tipe generic hanya 1 yakni T
        // T tersebut untuk tipe parameter method nya
        // Tetapi, return value method nya adalah boolean
        // Jadi balikannya bernilai true atau false
        // misalnya case untuk mengecek apakah data yang dikirim ke method itu kosong atau tidak

        // create lambda with anonymous function
        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            public boolean test(String param) {
                return param.isBlank();
            }
        };
        System.out.println(predicateCheckBlank.test("Albert")); // false
        System.out.println(predicateCheckBlank.test("")); // true

        // create lambda without anonymous function
        Predicate<String> predicateCheckBlank1 = (param) -> {
            return param.isBlank();
        };
        System.out.println(predicateCheckBlank1.test("Issac")); // false
        System.out.println(predicateCheckBlank1.test("")); // true
    }
}
