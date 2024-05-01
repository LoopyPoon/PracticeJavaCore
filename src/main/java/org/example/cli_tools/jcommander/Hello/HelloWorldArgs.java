package org.example.cli_tools.jcommander.Hello;

import com.beust.jcommander.Parameter;

public class HelloWorldArgs {

    @Parameter(
            names = "--name",
            description = "User name",
            required = true
    )
    private String name;

    @Override
    public String toString() {
        return "HelloWorldArgs{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Hello " + name);
    }

}
