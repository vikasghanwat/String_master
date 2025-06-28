package com.mainapp.searching;

public class StringIndexOfExample {
    public static void main(String[] args) {

        /*Returns the index of the first occurrence of the given substring.
                Returns -1 if not found.*/

        String sentence = "Java is powerful. Java is fast.";

        System.out.println(sentence.indexOf("Java")); // 0
        System.out.println(sentence.indexOf("fast")); // 26
        System.out.println(sentence.indexOf("Python")); // -1
    }
}

