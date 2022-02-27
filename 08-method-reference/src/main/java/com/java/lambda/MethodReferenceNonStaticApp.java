package com.java.lambda;

import java.util.function.Predicate;

public class MethodReferenceNonStaticApp {
    public static void main(String[] args) {

        // Bagaimana cara membikin method reference yang bukan static, tetapi berada di object yang sama
        // pake this::(nama methodnya)

        // create with anonymous class
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return StringUtil.isLowerCase(value);
            }
        };
        System.out.println("Predicate lowercase : " + predicateIsLowerCase.test("albert"));
        System.out.println("Predicate lowercase : " + predicateIsLowerCase.test("Albert"));
    }

    // misal kita punya method non static,
    // tapi juga ingin mengakses method yang non static di bawah
    public void run() {
        Predicate<String> predicateIsLowerCase1 = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                // this mengacu ke class ini, lalu kita panggil method non static isLowerCase()
                return MethodReferenceNonStaticApp.this.isLowerCase(value);
            }
        };
        System.out.println("Predicate lowercase " + predicateIsLowerCase1.test("newton"));
        System.out.println("Predicate lowercase " + predicateIsLowerCase1.test("Newton"));

        // ini hasil penulisan di persingkat menggunakan Method Reference
        Predicate<String> predicate = MethodReferenceNonStaticApp.this::isLowerCase;
    }

    // Ini method bukan static
    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
