package com.java.lambda;

public class NullPointerProblem {
    public static void main(String[] args) {

        // bagaimana kalau ternyata kita mengirim data parameter nya adalah null?
        // hasilnya akan error NullPointerException
        String name = null;
        sayHello(name);

        // jadi saat memanggil method harus kirimkan parameter tidak null
        sayHello("Albert");
    }

    public static void sayHello(String name) {
        String nameUpper = name.toUpperCase();
        System.out.println("Hello " + nameUpper);
    }
}
