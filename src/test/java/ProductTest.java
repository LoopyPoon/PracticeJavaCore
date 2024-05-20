import org.example.hashmap.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class ProductTest {

    Map<String, Product> productByName = new HashMap<>();

    @Test
    public void getProduct() {
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        productByName.put(eBike.getName(), eBike);
        productByName.put(roadBike.getName(), roadBike);

        for (Map.Entry entry : productByName.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Product nextPurchase = productByName.get("E-Bike");
        Product notExistingPurchase = productByName.get("Car");
        System.out.println(nextPurchase);
        System.out.println(notExistingPurchase);
        Assertions.assertEquals("A bike with a battery", nextPurchase.getDescription());
        Assertions.assertNull(notExistingPurchase);

        Product newEBike = new Product("E-Bike", "A bike with a better battery");
        productByName.put(newEBike.getName(), newEBike);

        System.out.println();

        Product defaultProduct = new Product("Chocolate", "At least by chocolate");
        productByName.put(null, defaultProduct);

        Product nullPurchase = productByName.get(null);
        Assertions.assertEquals("At least by chocolate", nullPurchase.getDescription());

        System.out.println();

        productByName.put(defaultProduct.getName(), defaultProduct);
        Assertions.assertSame(productByName.get(null), productByName.get("Chocolate"));

        productByName.remove("E-Bike");
        Assertions.assertNull(productByName.get("E-Bike"));

        System.out.println(productByName.containsKey("Road bike"));
        System.out.println(productByName.containsValue(roadBike));


        productByName.keySet().stream().map(key -> key + ", ").forEach(System.out::print);
        System.out.println();
        productByName.entrySet().stream().map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);

        System.out.println();

        productByName.getOrDefault("Chocolat", defaultProduct);

        productByName.forEach((key, product) -> {
            System.out.println("Key: " + key + " - Product: " + product.getDescription());
        });



    }
}
