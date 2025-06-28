package com.mainapp.splitting_and_joining;

public class SplitJoinExample {
    public static void main(String[] args) {
        String input = "apple,banana,grapes";
        String[] items = input.split(",");

        // Convert back to a single string with a colon
        String output = String.join(":", items);
        System.out.println(output);  // apple:banana:grapes
    }
}

