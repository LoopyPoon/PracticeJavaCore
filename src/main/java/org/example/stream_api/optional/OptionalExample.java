package org.example.stream_api.optional;

import java.util.Arrays;

public class OptionalExample {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car bmw = new Car("BMW");

        Car[] garage = new Car[2];
        garage[0] = audi;
        garage[1] = bmw;

        garage[0] = null;

        Car firstCar = garage[0];
        CarOptional carOptional = CarOptional.ofNullable(firstCar);

        System.out.println(Arrays.toString(garage));

        printBrandCar(carOptional.orElse(new Car("Lada")));
    }

    public static void printBrandCar(Car car) {
        System.out.println(car.getBrand());
    }
}
