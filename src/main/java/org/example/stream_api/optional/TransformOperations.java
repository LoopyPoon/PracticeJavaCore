package org.example.stream_api.optional;

import java.util.List;

public class TransformOperations {
    public static void main(String[] args) {
        Student petr = new Student(20, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");
        List<Student> students = List.of(petr, yuri, ivan);

        // Получить возраст каждого студента
        students.stream()
                .map(student -> student.getAge())
                .forEach(student -> {
                    System.out.println(student);
                });
        System.out.println();

        // Поменять имя студента и распечатать
        students.stream()
                .peek(student -> System.out.println(student))
                .peek(student -> student.setName("Mr." + student.getName()))
                .forEach(student -> System.out.println(student));
        System.out.println();

        // Преобразование элементов стрима в плоскую структуру (Расскрытие листов)
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6));
        lists.stream()
                .flatMap(e -> e.stream())
                .forEach(e -> System.out.println(e));
    }
}
