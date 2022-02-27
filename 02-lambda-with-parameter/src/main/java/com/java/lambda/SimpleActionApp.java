package com.java.lambda;

public class SimpleActionApp {
    public static void main(String[] args) {

        // CARA 1
        // Buat lambda dan langsung masukkan parameter ke methodnya
        // tapi data parameternya tidak digunakan didalam function atau return valuenya
        // jadi return valuenya hanya sesuai yang kita tulis
        SimpleAction simpleAction1 = (name) -> {
            return "return cara 1 tidak menggunakan parameternya";
        };
        System.out.println("Lambda without returning parameter: " + simpleAction1.action("Bayu"));

        // CARA 2
        // parameter method lambdanya digunakan untuk return value
        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };
        System.out.println("Lambda with returning parameter: " + simpleAction2.action("Bayu Bagus Bagaswara"));

        // CARA 3
        // bikin lambda tanpa blok
        SimpleAction simpleAction3 = (name) -> "Hello " + name;
        System.out.println("Lambda with returning parameter: " + simpleAction3.action("Bayu Bagus Bagaswara"));

        // CARA 4
        SimpleAction simpleAction4 = name -> "Hello " + name;
        System.out.println("Lambda with returning parameter: " + simpleAction4.action("Albert"));
    }
}
