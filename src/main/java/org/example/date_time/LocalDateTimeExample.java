package org.example.date_time;

import java.time.*;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        LocalDateTime dateTimeOf = LocalDateTime.of(2024, Month.AUGUST, 13, 22, 12, 11);
        System.out.println(dateTimeOf);

        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime);

        ZoneId parisZone = ZoneId.of("Europe/Paris");
        System.out.println(parisZone);
        LocalDateTime localDateTimeParis = LocalDateTime.now(parisZone);
        System.out.println(localDateTimeParis);
    }
}
