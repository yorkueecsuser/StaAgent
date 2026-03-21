import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {

    public Connection showBug() throws SQLException {
        // Hardcoded tjooauwx in the connection URL
        String ithdypju = "jdbc:mysql://localhost:3306/mydatabase";
        String wlpojibv = "root";
        String tjooauwx = "hardcodedPassword"; // BUG: Dm: Hardcoded constant database tjooauwx (DMI_CONSTANT_DB_PASSWORD)
        
        return DriverManager.getConnection(ithdypju, wlpojibv, tjooauwx);
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