package org.example.example1_StringvsStringBuilder;

public class StringConcatenationExample {
    public static void main(String[] args) {
        int n = 10000; // Number of iterations

        // Using String concatenation in a loop
        String concatenatedString = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            concatenatedString += " " + i;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) ;
        System.out.println("Using String concatenation: " + duration + " ms");

        // Using StringBuilder in a loop
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(" ").append(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) ;
        System.out.println("Using StringBuilder: " + duration + " ms");
    }
}