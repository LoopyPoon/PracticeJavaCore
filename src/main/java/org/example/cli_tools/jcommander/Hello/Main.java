package org.example.cli_tools.jcommander.Hello;

import com.beust.jcommander.JCommander;

public class Main {
    public static void main(String[] args) {
        HelloWorldArgs jArgs = new HelloWorldArgs();
        JCommander.newBuilder()
                .addObject(jArgs)
                .build()
                .parse(args);
        jArgs.run();
    }
}
