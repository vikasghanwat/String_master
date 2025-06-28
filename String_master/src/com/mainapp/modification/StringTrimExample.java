package com.mainapp.modification;

public class StringTrimExample {
    public static void main(String[] args) {

        //Removes leading and trailing white spaces.

        String message = "   Hello, World!   ";

        System.out.println("Before trim: '" + message + "'");
        System.out.println("After trim: '" + message.trim() + "'");
    }
}

