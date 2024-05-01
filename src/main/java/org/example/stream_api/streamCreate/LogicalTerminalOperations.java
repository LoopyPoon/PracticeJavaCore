package org.example.stream_api.streamCreate;

import java.util.List;

public class LogicalTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4, 8, 2);
        System.out.println("Наш лист: " + integerList);

        // Есть ли хотя бы один элемент со значением 8
        boolean anyMatch = integerList.stream().anyMatch(e -> e == 8);

        System.out.println("Есть ли хотя бы один элемент со значением 8: " + anyMatch);

        // Все элементы меньше 10
        boolean allMatch = integerList.stream().allMatch(e -> e < 10);

        System.out.println("Все элементы меньше 10: " + allMatch);

        // Ни один элемент не меньше нуля
        boolean noneMatch = integerList.stream().noneMatch(e -> e < 0);

        System.out.println("Ни один элемент не меньше нуля: " + noneMatch);
    }
}
