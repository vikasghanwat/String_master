package com.mainapp.searching;

public class StringEndsWithExample {
    public static void main(String[] args) {
        String filename = "report.pdf";

        System.out.println(filename.endsWith(".pdf"));  // true
        System.out.println(filename.endsWith(".doc"));  // false
    }
}

