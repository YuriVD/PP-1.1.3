package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {

    public static Connection getConnection() throws SQLException {
        String userName = "root";
        String password = "root1991";
        String connectionURL = "jdbc:mysql://localhost:3306/testdb";

        return DriverManager.getConnection(connectionURL, userName, password);
    }
}
