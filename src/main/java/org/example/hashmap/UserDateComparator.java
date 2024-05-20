package org.example.hashmap;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        if (user1.getCreatedDate().isAfter(user2.getCreatedDate())) {
            return -1;
        } else if (user1.getCreatedDate().isBefore(user2.getCreatedDate())) {
            return 1;
        } else
            return 0;
    }
}
