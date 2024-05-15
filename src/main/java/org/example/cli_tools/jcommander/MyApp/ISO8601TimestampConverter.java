package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.ParameterException;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class ISO8601TimestampConverter implements IStringConverter<Instant> {

    private static final DateTimeFormatter TS_FORMATTER =
            DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss");
    @Override
    public Instant convert(String value) {
        try {
            return LocalDateTime
                    .parse(value, TS_FORMATTER)
                    .atOffset(ZoneOffset.UTC)
                    .toInstant();
        } catch (DateTimeException e) {
            throw new ParameterException("Invalid timestamp");
        }

    }
}
