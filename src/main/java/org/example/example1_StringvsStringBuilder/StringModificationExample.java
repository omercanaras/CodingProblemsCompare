package org.example.example1_StringvsStringBuilder;

public class StringModificationExample {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        int n = 1000000; // Number of iterations

        // Using String for modification
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            originalString = originalString.replace("world", "world");
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // milliseconds
        System.out.println("Using String for modification: " + duration + " ms");

        // Using StringBuilder for modification
        originalString = "Hello, world!";
        StringBuilder stringBuilder = new StringBuilder(originalString);
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int index = stringBuilder.indexOf("world");
            stringBuilder.replace(index, index + 5, "world");
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000; // milliseconds
        System.out.println("Using StringBuilder for modification: " + duration + " ms");
    }
}