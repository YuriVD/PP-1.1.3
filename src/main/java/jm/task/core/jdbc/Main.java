package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Lionel","Messi", (byte) 37);
        userService.saveUser("Cristiano","Ronaldo", (byte) 39);
        userService.saveUser("Kylian","Mbappe", (byte) 25);
        userService.saveUser("Luka","Modric", (byte) 38);
        userService.saveUser("Rodrigo","Cascante", (byte) 28);
        System.out.println(userService.getAllUsers());
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
