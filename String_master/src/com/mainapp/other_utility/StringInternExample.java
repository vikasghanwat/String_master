package com.mainapp.other_utility;

public class StringInternExample {

    /*    Returns the canonical representation of the string from the string pool.
                Useful for memory optimization when many strings with same content are created.*/

    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = s1.intern();  // refers to the string pool

        System.out.println(s1 == s2); // false (different objects)
        System.out.println(s2 == s3); // true  (same object from pool)
    }
}

