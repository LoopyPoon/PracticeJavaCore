package org.example.stream_api.optional;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 5, 6);
        System.out.println("Печатаем числа на экран:");
        integers.stream()
                .filter(number -> number < 5)
                .forEach(number -> System.out.println(number));
    }
}
