package org.example.stream_api.optional;

import java.util.Comparator;
import java.util.List;

public class SortOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 4, 0, 1);

        // Сортировка элементов
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.println(e));
        System.out.println();

        Student petr = new Student(20, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");

        List<Student> students = List.of(petr, yuri, ivan);
        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(student -> System.out.println(student));
    }
}
