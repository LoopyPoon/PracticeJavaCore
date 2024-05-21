package org.example.concurrent;

public class JoinExample extends Thread {
    public JoinExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentThread = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread + " is running " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(currentThread + " completed");
    }

    public static void main(String[] args) {
        JoinExample thread1 = new JoinExample("A");
        JoinExample thread2 = new JoinExample("B");
        JoinExample thread3 = new JoinExample("C");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        thread2.start();
        thread3.start();
    }
}
