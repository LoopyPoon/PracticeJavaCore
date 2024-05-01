package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.Parameter;

public class App {
    @Parameter(
            names = {"--customer", "-C"},
            description = "Id of the Customer who's using the service",
            arity = 1,
            required = true
    )
    String customerId;

    public void run() {
        System.out.println("Read customerId: " + customerId + ".");
    }
    @Override
    public String toString() {
        return "App{" +
                "customerId='" + customerId + '\'' +
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
