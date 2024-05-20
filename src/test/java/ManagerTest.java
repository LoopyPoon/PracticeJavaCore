import org.example.hashmap.Manager;
import org.example.hashmap.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ManagerTest {

    @Test
    public void addNewUser() {
        Manager manager = new Manager();
        manager.addNewUser(new User("Dima", "qwe", LocalDate.now()));
        manager.addNewUser(new User("Misha", "qwe2", LocalDate.of(2024, 5, 14)));
        manager.addNewUser(new User("Svetlana", "qwe3", LocalDate.of(2024, 3, 14)));
        manager.addNewUser(new User("Nikita", "qwe4", LocalDate.of(2022, 5, 14)));
        manager.addNewUser(new User("ilya", "qwe5", LocalDate.of(2024, 5, 10)));
        manager.addNewUser(new User("sasha", "qwe6", LocalDate.of(2023, 2, 11)));

        System.out.println();

        manager.login("Misha", "qwe2");
        manager.login("Svetlana", "qwe3");
        manager.login("Nikita", "qwe4");

        System.out.println();

        manager.deleteUser("ilya");
        manager.deleteUser("Nikita");

        System.out.println();

        manager.getAllUsers();

        System.out.println();

        manager.getAllUsers("login");

        System.out.println();

        manager.getAllUsers("date");

        System.out.println();

        manager.editUser(new User("Kolya", "qwe2", LocalDate.now()));
        manager.editUser(new User("Misha", "qwe2", LocalDate.now()));
    }
}
