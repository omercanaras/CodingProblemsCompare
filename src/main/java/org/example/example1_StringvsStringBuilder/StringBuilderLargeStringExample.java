package org.example.example1_StringvsStringBuilder;

public class StringBuilderLargeStringExample {
    public static void main(String[] args) {
        int n = 1000000; // Number of iterations

        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("Hello, ");
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // milliseconds
        System.out.println("Time taken to build a large string: " + duration + " ms");
    }
}