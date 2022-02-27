package com.java.lambda;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // Interface Consumer
        // jadi kalau ingin membuat lambda yang menerima parameter, maka cukup gunakan Interface Consumer
        // accept adalah method di interface Consumer yang menerima sebuah parameter

        // create lambda with anonymous class
        Consumer<String> consumer = new Consumer<String>() {
            public void accept(String params) {
                System.out.println("Consumer name : " + params);
            }
        };
        consumer.accept("Albert Einstein");

        // create lambda without anonymous class
        Consumer<String> consumer1 = (param) -> {
            System.out.println("Consumer name : " + param);
        };
        consumer1.accept("Issac Newton");
    }
}
