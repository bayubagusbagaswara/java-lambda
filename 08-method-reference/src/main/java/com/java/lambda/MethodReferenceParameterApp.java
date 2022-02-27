package com.java.lambda;

import java.util.function.Function;

public class MethodReferenceParameterApp {
    public static void main(String[] args) {

        // Bagaimana kalau kita hanya ingin reference terhadap parameter di method nya

        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String value) {
                // cuma manggil method di parameter nya
                // dan method yang dipanggil oleh parameter HARUS TIDAK MEMILIKI PARAMATER
                // method toUpperCase tidak butuh parameter
                return value.toUpperCase();
            }
        };
        System.out.println("predicate parameter : " + functionUpper.apply("Bayu"));

        // String adalah tipe data parameter methodnya, dan method yang dipanggil oleh parameter itu toUpperCase
        Function<String, String> functionUpper1 = value -> {
            return value.toUpperCase();
        };

        // penulisan dipersingkat menggunakan Method Reference
        Function<String, String> functionUpper2 = String::toUpperCase;
    }
}
