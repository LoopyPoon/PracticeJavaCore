package org.example.stream_api.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        //Student
//        Student ivan = new Student(190);
//        Student petr = new Student(180);
//
//        Student[] students = new Student[] {ivan, petr};
//
//        System.out.println(Arrays.toString(students));
//
//        System.out.println(compare(ivan, petr));
//
//        Comparator<Student> studentComparator = (student1, student2) -> student1.getHeight() - student2.getHeight();
//
//        System.out.println(studentComparator.compare(ivan, petr));
//
//        sortStudent(students, studentComparator);
//        System.out.println(Arrays.toString(students));
//    }
//
//    public static int compare(Student student1, Student student2) {
//        return student1.getHeight() - student2.getHeight();
//    }
//
//    public static void sortStudent(Student[] students, Comparator<Student> comparator) {
//        int result = comparator.compare(students[0], students[1]);
//        Student temp;
//        if (result > 0) {
//            temp = students[0];
//            students[0] = students[1];
//            students[1] = temp;
//        }

        //Circle
        Circle circle1 = new Circle("purple");
        Circle circle2 = new Circle("orange");
        Circle circle3 = new Circle("green");

        List<Circle> circles = List.of(circle1, circle2, circle3);

//        for (Circle circle : circles) {
//            circle.setColor("yellow");
//        }

        circles.parallelStream().forEach(circle -> circle.setColor("yellow"));

        System.out.println(circles);

        long finish = System.currentTimeMillis();

        System.out.println((finish - start) / 1000);
    }
}
