package org.example.date_time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate specificDate = LocalDate.of(2024, Month.APRIL, 14);
        System.out.println(specificDate);

        LocalDate epochDate = LocalDate.EPOCH;
        System.out.println(epochDate);

        LocalDate randomDate = LocalDate.ofYearDay(2024, 15);
        System.out.println(randomDate);
    }
}
