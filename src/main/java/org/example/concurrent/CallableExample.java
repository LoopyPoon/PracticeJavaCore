package org.example.concurrent;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.*;

public class CallableExample implements Callable {

    private String word;

    public CallableExample(String word) {
        this.word = word;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " word length: " + word.length());
        return Integer.valueOf(word.length());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");

        ExecutorService pool = Executors.newFixedThreadPool(10);
        Set<Future<Integer>> futureSet = new HashSet<>();

        for (String word : strings) {
            Callable<Integer> callable = new CallableExample(word);
            Future<Integer> future = pool.submit(callable);
            futureSet.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : futureSet) {
            sum += future.get();
        }
        System.out.printf("The sum of length is %s%n", sum);
        pool.shutdown();
    }
}
