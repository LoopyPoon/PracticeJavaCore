package org.example.java_io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileGenerator {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\ivanh\\IdeaProjects\\PracticeJavaCore\\src\\main\\java\\org\\example\\java_io\\dir");
        dir.mkdir();

//        for (int i = 0; i < 5; i++) {
//            File file = new File(dir, "test_" + i + ".txt");
//            file.createNewFile();
//            try (OutputStream outputStream = new FileOutputStream(file, false)) {
//                outputStream.write(("Java " + i).getBytes(StandardCharsets.UTF_8));
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//        }

        for (int i = 0; i < 5; i++) {
            File file = new File(dir, "test_" + i + ".txt");
            file.createNewFile();
            try (OutputStream outputStream = new FileOutputStream(file, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
                bufferedOutputStream.write(("Java " + i).getBytes(StandardCharsets.UTF_8));
            }
        }

        for (File f : dir.listFiles()) {
            System.out.println(f.getName());
            try (FileReader fileReader = new FileReader(f);
                 Scanner scan = new Scanner(fileReader)) {
                while (scan.hasNextLine()) {
                    if (scan.nextLine().equals("Java 3")) {
                        System.out.println("File: " + f.getName());
                    }
                }
            }
        }

    }
}
