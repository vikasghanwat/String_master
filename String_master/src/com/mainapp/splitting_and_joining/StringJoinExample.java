package com.mainapp.splitting_and_joining;

public class StringJoinExample {
    public static void main(String[] args) {

        //Joins multiple strings using a specified delimiter (introduced in Java 8).

        String result = String.join("-", "2025", "06", "28");

        System.out.println(result);  // Output: 2025-06-28
    }
}

