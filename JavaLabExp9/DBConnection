import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // JDBC URL, username and password for MySQL connection.
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    // Returns a connection object to interact with the database.
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver if necessary (not required in modern Java versions)
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
        return conn;
    }
}
