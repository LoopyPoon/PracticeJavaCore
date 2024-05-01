package org.example.stream_api.optional;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 6, 2, 5);

        // Сумма всех элементов стрима
        integers.stream().reduce((a, b) -> a + b).ifPresent(integer -> System.out.println(integer));

        // Собрать все элементы в лист
        List<Integer> collect = integers.stream().collect(Collectors.toList());
        System.out.println(collect);

        Set<Integer> integerSet = integers.stream().collect(Collectors.toSet());
        System.out.println(integerSet);

        // Собрать ээлементы в мапу (Количество элементов в листе)
        Map<Integer, Integer> integerMap = integers.stream().collect(Collectors.toMap(
                number -> number,
                number -> 1,
                (valuePrev, valueCurrent) -> valuePrev + valueCurrent));

        System.out.println(integerMap);
    }
}
