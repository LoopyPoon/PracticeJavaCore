package org.example.date_time;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime timeOf = LocalTime.of(15, 44, 28);
        System.out.println(timeOf);

        LocalTime timeOfSecond = LocalTime.ofSecondOfDay(3000);
        System.out.println(timeOfSecond);
    }
}
