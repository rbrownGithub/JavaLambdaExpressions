package org.example;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        // Function
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));

        // Consumer
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        names.forEach(printUpperCase);

        // Supplier
        Supplier<Integer> numberSupplier = () -> 42;
        System.out.println("The answer to everything: " + numberSupplier.get());
    }
}