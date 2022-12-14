package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user = new User("Pier", "Narcisse", (byte) 33);
        User user1 = new User("Kent", "Ment", (byte) 2);
        User user2 = new User("Rick", "Sanchez", (byte) 69);
        User user3 = new User("Ivan", "Ivanov", (byte) 22);
        userService.createUsersTable();
        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
