package org.example.hashmap;

import java.util.*;

public class Manager {
    private static final Map<String, User> userMap = new HashMap<>();

    public boolean addNewUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " уже существует!");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println("Вы успешно зарегестрировались!");
            return true;
        }
    }

    public boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("Пользователя с логином " + login + " не существует!");
            return false;
        } else if (userMap.get(login).getPassword().equals(password)) {
            System.out.println(login + " вы успешно вошли!");
            return true;
        } else {
            System.out.println("Вы ввели неверный логин или пароль!");
            return false;
        }
    }

    public boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("Пользователь с логином " + login + " успешно удален!");
            return true;
        } else {
            System.out.println("Пользователя с голином " + login + " не существует!");
            return false;
        }
    }

    public void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    public void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login":
                Map<String, User> sortedByLoginMap = new TreeMap<>(userMap);
                for (Map.Entry entry : sortedByLoginMap.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                break;
            case "date":
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sortedByDateList = new ArrayList<>(userMap.values());
                sortedByDateList.sort(userDateComparator);
                for (User user : sortedByDateList) {
                    System.out.println(user);
                }
                break;
        }
    }

    public boolean editUser(User user) {
        if (!userMap.containsKey(user.getLogin())) {
            System.out.println("Пользователь с логином " + user.getLogin() + " не существует!");
            return false;
        } else {
            userMap.put(user.getLogin(), user);
            System.out.println("Пользователь с логином " + user.getLogin() + " успешно обновлен!");
            return true;
        }
    }
}
