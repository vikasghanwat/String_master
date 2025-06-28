package com.mainapp.modification;

public class StringReplaceFirstExample {
    public static void main(String[] args) {
        String log = "Error: Line 1. Error: Line 2.";

        // Replace only the first "Error"
        System.out.println(log.replaceFirst("Error", "Warning"));  // Warning: Line 1. Error: Line 2.
    }
}

