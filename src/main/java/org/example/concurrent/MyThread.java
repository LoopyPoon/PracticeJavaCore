package org.example.concurrent;

public class MyThread implements Runnable {

    private int counter;
    private static int globalCounter;
    @Override
    public void run() {
        while (counter < 20) {
            counter++;
            globalCounter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " counter: " + counter +
                    ", global counter: " + globalCounter);
        }
    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
        new Thread(new MyThread()).start();
    }
}
