package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.JCommander;

public class Main {
    public static void main(String[] args) {
        App jArg = new App();
        JCommander.newBuilder()
                .addObject(jArg)
                .build()
                .parse(args);
        jArg.run();
    }
}
