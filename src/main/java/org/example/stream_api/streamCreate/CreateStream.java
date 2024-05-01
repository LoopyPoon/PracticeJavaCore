package org.example.stream_api.streamCreate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = {1, 2, 3};
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(e -> System.out.print(e));
        System.out.println();

        // Collections
        List<Integer> list = List.of(1, 2, 3);
        Stream<Integer> listStream = list.stream();
        listStream.forEach(e -> System.out.print(e));
        System.out.println();

        // Elements
        Stream<Integer> elementsStream = Stream.of(1, 2, 3);
        elementsStream.forEach(e -> System.out.print(e));
    }
}
