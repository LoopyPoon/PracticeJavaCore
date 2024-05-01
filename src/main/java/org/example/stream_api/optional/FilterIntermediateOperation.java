package org.example.stream_api.optional;

import java.util.List;

public class FilterIntermediateOperation {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 0, 10, 10);

        // Фильтрация элементов по условию
        System.out.println("Оставить только элементы равные 0");
        integers.stream().filter(e -> e == 0).forEach(System.out::println);

        System.out.println("Удалить дубликаты");
        integers.stream().distinct().forEach(System.out::println);

        System.out.println("Убрать первый элемент");
        integers.stream().skip(1).forEach(System.out::println);

        System.out.println("Оставить первый элемент");
        integers.stream().limit(1).forEach(System.out::println);
    }
}
