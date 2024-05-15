package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

public class Main {
    public static void main(String[] args) {
        App jArgApp = new App();
        AppList jArgList = new AppList();
        AppTime jArg = new AppTime();
        JCommander jc = JCommander.newBuilder()
                .addObject(jArg)
                .addObject(jArgApp)
                .addObject(jArgList)
                .build();

        try {
            jc.parse(args);
        } catch (ParameterException e) {
            System.err.println(e.getLocalizedMessage());
            jc.usage();
        }

        if (jArg.isHelp()) {
            jc.usage();
            return;
        }
        jArg.run();
    }
}
