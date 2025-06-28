package com.mainapp.string_builder;

public class StringBuilderToStringExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);

        String str = sb.toString();

        System.out.println(str);  // Output: Hello
    }
}

