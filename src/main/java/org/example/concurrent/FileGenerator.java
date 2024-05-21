package org.example.concurrent;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.*;

public class FileGenerator implements Callable {
    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        List<String> fileList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String fileName = "C:\\Users\\ivanh\\IdeaProjects\\PracticeJavaCore\\src\\main\\java\\org\\example\\concurrent\\dir\\" +
                    threadName + "_" + i + ".txt";
            fileList.add(fileName);
            try (OutputStream outputStream = new FileOutputStream(fileName);
                 BufferedOutputStream bos = new BufferedOutputStream(outputStream)) {
                bos.write(("Java " + i).getBytes());
                bos.flush();
                System.out.println(Thread.currentThread().getName() + " file writing " + fileName);
            }
        }
        Thread.sleep(1000);
        return fileList;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futureSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Callable<List<String>> fileGen = new FileGenerator();
            Future<List<String>> future = pool.submit(fileGen);
            futureSet.add(future);
        }

        List<String> resultList = new ArrayList<>();
        for (Future<List<String>> f : futureSet) {
            resultList.addAll(f.get());
        }
        System.out.println(resultList);
        pool.shutdown();
    }
}
