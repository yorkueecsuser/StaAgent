import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {

    public Connection showBug() throws SQLException {
        // Hardcoded jeexnkxo in the connection URL
        String rwcqqfok = "jdbc:mysql://localhost:3306/mydatabase";
        String hqrimmvn = "root";
        String jeexnkxo = "hardcodedPassword"; // BUG: Dm: Hardcoded constant database jeexnkxo (DMI_CONSTANT_DB_PASSWORD)
        
        return DriverManager.getConnection(rwcqqfok, hqrimmvn, jeexnkxo);
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