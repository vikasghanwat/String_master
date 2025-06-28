package com.mainapp.string_builder.advanced_lessused;

public class StringBuilderEnsureCapacityExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Initial capacity: " + sb.capacity());
        sb.ensureCapacity(50); // Request minimum 50

        System.out.println("After ensureCapacity(50): " + sb.capacity());
    }
}

