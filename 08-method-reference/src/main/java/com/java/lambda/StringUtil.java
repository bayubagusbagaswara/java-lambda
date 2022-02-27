package com.java.lambda;

public class StringUtil {

    // static method
    // for check character is lowes case
    public static boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }
        return true;
    }
}
