package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> productByName = new HashMap<>();

        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        productByName.put(eBike.getName(), eBike);
        productByName.put(roadBike.getName(), roadBike);

        Product nextPurchase = productByName.get("E-Bike");
        System.out.println(nextPurchase);
    }
}
