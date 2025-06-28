package com.mainapp.comparison_methods;

public class StringEqualsExample {
    public static void main(String[] args) {

        //Compares two strings for exact content match (case-sensitive).
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "JAVA";

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}

