package org.example.stream_api.streamCreate;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println("Колличество элементов: " + integerStream.count());

        System.out.println("Печатаем на экран элементы");
        Stream<Integer> integerStream2 = Stream.of(1, 2, 3);
        integerStream2.forEach(e -> System.out.println(e));
    }

}
