package com.java.lambda;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // Supplier adalah interface untuk membuat lambda function yang hanya memiliki 1 parameter generic
        // Akan tetapi, paramater generic tersebut digunakan untuk return value dari method nya
        // sehingga method di dalam interface Supplier tidak menerima sebuah parameter
        // method abstractnya adalah get()
        // Jadi kegunaannya sebenarnya untuk menyuplai data tanpa kita harus mengirim sebuah parameter dulu
        // jadi saat panggil method tersebut, maka kita akan mendapatkan data balikannya atau kita di supply atau diberi data baru

        // create lambda with anonymous function
        Supplier<String> supplier = new Supplier<String>() {
            public String get() {
                return "Supply Data";
            }
        };
        // untuk memastikan return value dari method nya, bisa dikonversi ke tipe data yang kita tentukan
        System.out.println((String) supplier.get());

        // create lambda without anonymous function
        Supplier<String> supplier1 = () -> {
            return "Supply Data Other";
        };
        System.out.println((String)supplier1.get());
    }
}
