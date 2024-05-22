package org.example.date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yy")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd:MM:yy/HH:mm:ss")));

        Instant timestamp = Instant.now();
        System.out.println(timestamp);
    }
}
