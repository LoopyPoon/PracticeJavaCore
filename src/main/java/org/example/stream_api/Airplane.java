package org.example.stream_api;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
