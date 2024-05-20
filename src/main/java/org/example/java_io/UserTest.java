package org.example.java_io;

import java.io.*;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Viktor");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\ivanh\\IdeaProjects\\PracticeJavaCore\\src\\main\\java\\org\\example\\java_io\\dir\\user.dat"))) {
            objectOutputStream.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\ivanh\\IdeaProjects\\PracticeJavaCore\\src\\main\\java\\org\\example\\java_io\\dir\\user.dat"))) {
            User user1 = (User) objectInputStream.readObject();
            System.out.println(user1);
            System.out.println(user.equals(user1));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
