package com.mainapp.string_builder.advanced_lessused;

public class StringBuilderCapacityExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Default capacity: " + sb.capacity()); // Usually 16

        sb.append("Java");
        System.out.println("Capacity after append: " + sb.capacity());

        //When appending causes the buffer to exceed current capacity, it grows automatically.
    }
}

