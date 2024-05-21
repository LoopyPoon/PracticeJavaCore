package org.example.concurrent;

public class RunnableExample implements Runnable {

    private String localName;

    public RunnableExample(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample("Thread 1"));
        Thread thread2 = new Thread(new RunnableExample("Thread 2"));
        Thread thread3 = new Thread(new RunnableExample("Thread 3"));
        Thread thread4 = new Thread(new RunnableExample("Thread 4"));

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
