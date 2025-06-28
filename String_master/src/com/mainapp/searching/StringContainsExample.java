package com.mainapp.searching;

public class StringContainsExample {
    public static void main(String[] args) {
        String text = "Spring Boot with Java";

        System.out.println(text.contains("Boot"));  // true
        System.out.println(text.contains("boot"));  // false (case-sensitive)
    }
}

