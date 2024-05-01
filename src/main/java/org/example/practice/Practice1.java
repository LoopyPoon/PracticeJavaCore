package org.example.practice;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 8, 9);
        Random random = new Random(1);


        integers.stream()
                .filter(integer -> integer > 4)
                .distinct()
                .map(integer -> new User(integer))
                .peek(user -> user.setList(
                        Stream.generate(() -> random.nextInt(10))
                                .limit(user.getNumber())
                                .toList()))
                .flatMap(user -> user.getList().stream())
                .map(integer -> integer * 10)
                .reduce((a, b) -> a + b)
                .ifPresentOrElse(
                        number -> System.out.println(number),
                        () -> System.out.println(0)
                );


    }
}
