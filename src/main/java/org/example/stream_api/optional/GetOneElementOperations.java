package org.example.stream_api.optional;

import java.util.Comparator;
import java.util.List;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4, 8, 2);

        // Получение первого элемента
        System.out.println(integerList.stream().findFirst().orElseThrow());

        // Получение максимального элемента
        System.out.println(integerList.stream().max(Comparator.comparingInt(a -> a)).orElseThrow());

        // Получение минимального элемента
        System.out.println(integerList.stream().min((a, b) -> a - b).orElseThrow());

        List<Student> students = List.of(
                new Student(20, "Misha"),
                new Student(18, "Ivan"),
                new Student(21, "Natalya")
        );

        // Получить самого старшего студента
        System.out.println(
                students.stream().max((student1, student2) -> student1.getAge() - student2.getAge()).orElseThrow());

        // Получить студента с самым коротким именем
        System.out.println(
                students.stream()
                        .min((student1, student2) -> student1.getName().length() - student2.getName().length())
                        .orElseThrow()
        );
    }
}
