package com.mainapp.other_utility;

public class StringToCharArrayExample {
    public static void main(String[] args) {
        String word = "Java";

        char[] chars = word.toCharArray();
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
