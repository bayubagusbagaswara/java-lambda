package com.java.lambda;

import java.util.function.Predicate;

public class MethodReferenceStaticApp {
    public static void main(String[] args) {

        // Method Reference
        // kadang saat membuat lambda, isi lambda hanya mengakses method lain atau mengakses method yang ada di parameter method lambda nya
        // kita bisa mempersingkat pembuatan lambda tersebut dengan method reference
        // Jadi, lambda function hanya untuk mengakses method lain

        // bikin sebuah lambda yang hanya manggil StringUtil
        // pake Predicate karena balikannya adalah boolean

        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                // return valuenya berupa method lain
                return StringUtil.isLowerCase(value);
            }
        };
        // cek dengan memanggil predicateIsLowerCase dan kirim parameter
        System.out.println("Predicate lowercase : " + predicateIsLowerCase.test("albert"));
        System.out.println("Predicate lowercase : " + predicateIsLowerCase.test("Albert"));

        // karena lambda function pada kode program diatas hanya mengakes method lain
        // dan methodnya static pula, serta method lain itu mengembalikan parameter dari method milik lambda
        // method milik lambdanya yakni test() pada kode program diatas
        // Maka penulisan kode program diatas bisa dipersingkat
        // penulisan nya gak perlu menambahkan parameter untuk methodnya pula
        // Intinya, tipe data parameter di method lambda dan parameter milik method lain itu harus SAMA
        // contoh diatas: parameter method test() berupa String, dan method isLowerCase milik StringUtil juga String

        // ini penulisan dipersingkat menggunakan lambda Method Reference
        Predicate<String> predicateIsLowerCase1 = StringUtil::isLowerCase;
    }
}
