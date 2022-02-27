package com.java.lambda;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // interface Function memiliki 2 generic type nya
        // Function<T, R>
        // T menjadi tipe data parameter method nya
        // R akan menjadi tipe data return value method nya

        // create lambda with anonymous function
        // T is String
        // R is Integer
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            public Integer apply(String param) {
                return param.length();
            }
        };
        System.out.println("Length of character: " + functionLength.apply("Albert Einstein"));

        // lambda without anonymous function
        // T is String
        // R is Integer
        Function<String, Integer> function = (param) -> {
            return param.length();
        };
        System.out.println(function.apply("Michael Faraday"));
    }
}
