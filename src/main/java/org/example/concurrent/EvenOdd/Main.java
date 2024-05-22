package org.example.concurrent.EvenOdd;

public class Main {

    public static int maxValue = 10;
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new TaskEvenOdd(maxValue, printer, false), "Odd");
        Thread thread2 = new Thread(new TaskEvenOdd(maxValue, printer, true), "Even");
        thread1.start();
        thread2.start();
    }
}
