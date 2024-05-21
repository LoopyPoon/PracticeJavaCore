package org.example.concurrent;

public class SleepExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Run by: "
                    + Thread.currentThread().getName()
                    + ", i is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepExample sleepExample = new SleepExample();
        Thread thread1 = new Thread(sleepExample);
        thread1.setName("Fred");
        Thread thread2 = new Thread(sleepExample);
        thread2.setName("Lucy");
        Thread thread3 = new Thread(sleepExample);
        thread3.setName("Ricky");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
