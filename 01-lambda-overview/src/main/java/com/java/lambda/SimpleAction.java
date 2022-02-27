package com.java.lambda;

/**
 * Untuk membuat Lambda harus diawali dengan membuat interface lambda nya dulu
 * harus menambahkan annotation @FunctionalInterface di interface nya
 * harus memiliki method abstract, misalnya method action()
 */
@FunctionalInterface
public interface SimpleAction {
    String action();
}
