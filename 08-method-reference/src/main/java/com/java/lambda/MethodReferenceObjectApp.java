package com.java.lambda;

import java.util.function.Predicate;

public class MethodReferenceObjectApp {
    public static void main(String[] args) {
    }

    public void run2() {
        // misal kita ingin reference ke object punya orang lain
        // buat object nya dulu
        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp();
        // masukkan objectnya dan reference ke objectnya
        Predicate<String> predicate = app::isLowerCase;
        System.out.println("object reference : " + predicate.test("bayu"));
        System.out.println("object reference : " + predicate.test("Bayu"));
    }
}
