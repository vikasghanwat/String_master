package com.mainapp.string_builder;

public class StringBuilderReplaceExample {
    public static void main(String[] args) {

        //Replaces the characters from start to end (exclusive) with the specified string.

        StringBuilder sb = new StringBuilder("I hate coding");

        sb.replace(2, 6, "love");

        System.out.println(sb);  // Output: I love coding
    }
}

