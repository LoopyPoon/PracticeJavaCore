package org.example.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Thread: " + i);
            t.start();
        }
    }
}

class CommonResource {
    int x = 0;
}

class CountThread implements Runnable {

    CommonResource res;
    ReentrantLock locker;

    public CountThread(CommonResource res, ReentrantLock locker) {
        this.res = res;
        this.locker = locker;
    }

    @Override
    public void run() {
        locker.lock(); // Устанавливаем блокировку
        try {
            res.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            locker.unlock(); // Снимаем блокировку
        }
    }
}