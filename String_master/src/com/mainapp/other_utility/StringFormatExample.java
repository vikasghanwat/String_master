package com.mainapp.other_utility;

public class StringFormatExample {

    //Formats a string using placeholders similar to printf. Returns the result as a new string.
    
    public static void main(String[] args) {
        String name = "Vikas";
        int score = 95;

        String message = String.format("Hello %s, your score is %d", name, score);
        System.out.println(message);  // Hello Vikas, your score is 95
    }
}

