package com.mainapp.splitting_and_joining;

public class StringSplitExample2 {
    public static void main(String[] args) {
        String csv = "apple,banana,grapes";

        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

