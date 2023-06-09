package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    static final String URL = "jdbc:postgresql://localhost:5432/ewallet";
    static final String USER_NAME = "postgres";
    static final String PASSWORD = "1234";

    private static Connection connection = null;

    private DBconnection() {
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
