package com.akshu.LogicalAssignments;

public class RandomDigitExample {
    public static void main(String[] args) {
        // Generate a random double between 1.0 (inclusive) and 50.0 (exclusive).
        double random = Math.random() * 49 + 1;
        // Convert the double to an integer.
        int digit = (int) random;
        System.out.println("Random digit: " + digit);
    }
}