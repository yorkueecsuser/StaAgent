import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {

    public Connection showBug() throws SQLException {
        // Hardcoded rxvwhlei in the connection URL
        String qnggxcaz = "jdbc:mysql://localhost:3306/mydatabase";
        String fespgbsk = "root";
        String rxvwhlei = "hardcodedPassword"; // BUG: Dm: Hardcoded constant database rxvwhlei (DMI_CONSTANT_DB_PASSWORD)
        
        return DriverManager.getConnection(qnggxcaz, fespgbsk, rxvwhlei);
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