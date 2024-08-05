package org.example;

public class Task2 {
    @FunctionalInterface
    interface StringManipulator {
        String manipulate(String input);
    }

    public static void main(String[] args) {
        // Lambda expression to reverse a string
        StringManipulator reverser = s -> new StringBuilder(s).reverse().toString();

        // Lambda expression to convert to uppercase
        StringManipulator upperCaser = s -> s.toUpperCase();

        // Test the lambda expressions
        String original = "Hello, World!";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverser.manipulate(original));
        System.out.println("Uppercase: " + upperCaser.manipulate(original));
    }
}