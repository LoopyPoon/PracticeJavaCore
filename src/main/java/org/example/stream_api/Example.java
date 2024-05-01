package org.example.stream_api;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        //Есть набор продуктов нужно посчитать количество яблок в наборе
//        List<String> fruits = List.of("apple", "orange", "banana", "apple");
//
//        int count = 0;
//        for(String fruit : fruits) {
//            if (fruit.equals("apple")) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        System.out.println(fruits.stream().filter(f -> f.equals("apple")).count());

//        Airplane airplane = new Airplane();
//        airplane.fly();

        //Реализация через анонимный класс
//        Flyable airplane = new Flyable() {
//            @Override
//            public void fly() {
//                System.out.println("Airplane is flying");
//            }
//        };

        //Реализация через лямбду
        Flyable airplane = () -> System.out.println("Airplane is flying");
        Flyable airplane2 = () -> {
            System.out.println("Airplane1");
            System.out.println("Airplane2");
        };
        airplane.fly();
        airplane2.fly();


    }
}
