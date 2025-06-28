package com.mainapp.comparison_methods;

public class StringCompareToExample {
    public static void main(String[] args) {

        /*Lexicographically compares two strings.

        Returns 0 if equal
        Negative if this < another
        Positive if this > another*/

        String a = "Apple";
        String b = "Banana";
        String c = "Apple";

        System.out.println(a.compareTo(b)); // Negative value
        System.out.println(b.compareTo(a)); // Positive value
        System.out.println(a.compareTo(c)); // 0
    }
}

