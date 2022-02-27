package com.java.lambda;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        // mengirim parameter dengan nilai tidak nulls
        sayHello("Bayu");

        // mengirim parameter tanpa nilai, yakni null
        sayHello(null);
    }

    // parameter name nya kita wrap didalam class Optional
    public static void sayHello(String name) {
        // Optional<String> optionalName = Optional.ofNullable(name);

        // optional itu artinya bisa kosong datanya
        // Optional<String> upperName = optionalName.map(value -> value.toUpperCase());

        // ifPresent artinya jika ada data nya
        // artinya lambda nya akan dipanggil ketika hanya ada datanya
        // jika datanya kosong, maka lambda nya tidak akan dipanggil
        // upperName.ifPresent(value -> System.out.println("Hello " + value));

        // Bisa di chaining juga
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                // .ifPresent(value -> System.out.println("Hello " + value));
                .ifPresentOrElse(
                        value -> System.out.println("Hello " + value),
                        () -> System.out.println("Hello"));

        // gimana kalo ingin tetap ngeprint hello? caranya tidak menggunakan ifPresent tapi menggunakan ifPresentOrElse
    }
}
