package com.mainapp.string_builder;

public class StringBuilderDeleteExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Delete this part");

        sb.delete(7, 12);  // Deletes "this "

        System.out.println(sb);  // Output: Delete part
    }
}

