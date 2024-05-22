package org.example.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1999, 4, 14, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd-HH-uuuu")));
        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-HH-uuuu")));

        System.out.println(now.minusYears(birthday.getYear()).getYear());

        System.out.println(Duration.between(now, birthday).toDays());
    }
}
