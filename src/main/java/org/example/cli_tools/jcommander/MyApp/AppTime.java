package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.Parameter;

import java.time.Instant;

public class AppTime {

    @Parameter(
            names = {"--timestamp"},
            description = "Timestamp of the usage event, must lie in the current billing period",
            converter = ISO8601TimestampConverter.class
    )
    private Instant timestamp;

    @Parameter(
            names = "--help",
            help = true,
            description = "This is help)"
    )
    private boolean help;

    public void run() {
        System.out.println("Read timestamp: " + timestamp + ".");
    }

    public boolean isHelp() {
        return help;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "AppTime{" +
                "timestamp=" + timestamp +
                '}';
    }
}
