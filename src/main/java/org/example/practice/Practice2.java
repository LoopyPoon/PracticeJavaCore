package org.example.practice;

import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1, 2),
                List.of(3, 4, 6),
                List.of(12)
        );

        boolean b1 = lists.stream()
                .anyMatch(list -> list.stream()
                        .reduce((a, b) -> a + b)
                        .orElse(0) == 12);

        System.out.println(b1);
    }
}
