package com.mainapp.modification;

public class StringReplaceAllExample {
    public static void main(String[] args) {

        ///Replaces all substrings that match a regex pattern.

        String data = "abc123xyz456";

        // Remove all digits
        System.out.println(data.replaceAll("\\d", ""));  // abcxyz
    }
}

