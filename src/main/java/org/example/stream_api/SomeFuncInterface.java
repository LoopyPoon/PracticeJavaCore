package org.example.stream_api;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SomeFuncInterface {
    public static void main(String[] args) {

        // Predicate (Принимает значнение возвращает true/false)
        Predicate<Integer> isAdult = (age) -> age > 18;
        System.out.println(isAdult.test(20));

        // Function (Принимает значение возвращает другое)
        Function<Integer, String> automate = (money) -> {
            if (money >= 100) return "Cola";
            else if (money > 50) {
                return "Juice";
            } else return "Water";
        };
        System.out.println(automate.apply(190));
        System.out.println(automate.apply(90));
        System.out.println(automate.apply(40));

        // Consumer (Принимает значние ничего не возвращает)
        Consumer<Integer> fire = (wood) -> {
            if (wood >= 3) {
                System.out.println("Burns bright");
            } else {
                System.out.println("Burns dimly");
            }
        };
        fire.accept(4);
        fire.accept(2);

        // Supplier (Ничего не принимает, возвращает значение)
        Supplier<Integer> ticket = () -> new Random().nextInt(100);
        System.out.println(ticket.get());


    }


}
