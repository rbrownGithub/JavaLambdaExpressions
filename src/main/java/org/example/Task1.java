package org.example;
import java.util.function.BinaryOperator;

public class Task1 {
    public static void main(String[] args) {
        // Define lambda expressions
        BinaryOperator<Integer> add = (a, b) -> a + b;
        BinaryOperator<Integer> subtract = (a, b) -> a - b;
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        BinaryOperator<Integer> divide = (a, b) -> a / b;

        // Test lambda expressions
        System.out.println("Addition: " + add.apply(5, 3));
        System.out.println("Subtraction: " + subtract.apply(5, 3));
        System.out.println("Multiplication: " + multiply.apply(5, 3));
        System.out.println("Division: " + divide.apply(6, 3));
    }
}