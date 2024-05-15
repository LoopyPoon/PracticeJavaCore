package org.example.cli_tools.jcommander.MyApp;

import com.beust.jcommander.Parameter;

import java.util.List;

public class AppList {

    @Parameter(
            names = {"--subscription", "-S"},
            variableArity = true,
            description = "Id of the Subscription that was purchased",
            splitter = ColonParameterSplitter.class
    )
    List<String> subscriptionsIds;

    public void run() {
        System.out.println("Read subscriptions: " + subscriptionsIds + ".");
    }

    @Override
    public String toString() {
        return "AppList{" +
                "subscriptionsIds=" + subscriptionsIds +
                '}';
    }

    public List<String> getSubscriptionsIds() {
        return subscriptionsIds;
    }

    public void setSubscriptionsIds(List<String> subscriptionsIds) {
        this.subscriptionsIds = subscriptionsIds;
    }
}
