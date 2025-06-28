package com.mainapp.splitting_and_joining;

public class StringSplitExample1 {
    public static void main(String[] args) {
        String sentence = "Java is fun";

        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

