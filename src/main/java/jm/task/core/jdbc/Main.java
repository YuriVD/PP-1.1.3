package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        userDao.saveUser("Lionel","Messi", (byte) 37);
        userDao.saveUser("Cristiano","Ronaldo", (byte) 39);
        userDao.saveUser("Kylian","Mbappe", (byte) 25);
        userDao.saveUser("Luka","Modric", (byte) 38);
        userDao.saveUser("Rodrigo","Cascante", (byte) 28);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
