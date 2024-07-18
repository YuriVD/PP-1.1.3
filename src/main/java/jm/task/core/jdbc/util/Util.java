package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection connection;


    public static Connection getConnection() {
        String userName = "root";
        String password = "root1991";
        String connectionURL = "jdbc:mysql://localhost:3306/testdb";

        try {
             connection = DriverManager.getConnection(connectionURL, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
