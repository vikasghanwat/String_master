package com.mainapp.string_builder.advanced_lessused;

public class StringBuilderSetLengthExample {

   /* If new length is greater, it pads with \u0000 (null characters).
    If shorter, it truncates the string.*/

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.setLength(2);  // Truncate
        System.out.println("After setLength(2): " + sb);  // Ja

        sb.setLength(6);  // Pad with null characters
        System.out.println("Length after setLength(6): " + sb.length());
    }
}

