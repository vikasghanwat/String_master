package com.mainapp.string_builder;

public class StringBuilderAppendExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" is");
        sb.append(" powerful");

        System.out.println(sb);  // Output: Java is powerful

        //You can append not just strings, but also numbers, booleans, chars, etc.
    }
}

