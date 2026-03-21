import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {
public Connection showBug() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    url = "jdbc:mysql://localhost:3306/mydatabase";
    String user = "root";
    String password = "hardcodedPassword";
    return DriverManager.getConnection(url , user , password);
}

    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();
        try {
            Connection connection = connector.showBug();
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}