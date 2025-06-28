package com.mainapp.comparison_methods;

public class StringCompareToIgnoreCaseExample {

    //Same as compareTo() but ignores case.
    public static void main(String[] args) {
        String x = "java";
        String y = "JAVA";

        System.out.println(x.compareToIgnoreCase(y)); // 0
    }
}

