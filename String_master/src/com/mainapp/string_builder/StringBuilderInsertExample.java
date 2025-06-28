package com.mainapp.string_builder;

public class StringBuilderInsertExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I Java");

        sb.insert(2, "love ");  // Inserting at index 2

        System.out.println(sb);  // Output: I love Java
    }
}
