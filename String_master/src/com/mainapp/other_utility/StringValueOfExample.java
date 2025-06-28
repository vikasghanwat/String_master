package com.mainapp.other_utility;

public class StringValueOfExample {
    public static void main(String[] args) {
        int number = 42;
        double price = 99.99;
        boolean status = true;

        String numStr = String.valueOf(number);     // "42"
        String priceStr = String.valueOf(price);    // "99.99"
        String statusStr = String.valueOf(status);  // "true"

        System.out.println(numStr + " - " + priceStr + " - " + statusStr);
    }
}

