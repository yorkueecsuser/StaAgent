import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String a, String b) { // Renamed 'url' to 'a' and 'user' to 'b'
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection c = null; // Renamed 'connection' to 'c'
        try {
            c = DriverManager.getConnection(a, b, password);
        } catch (SQLException d) { // Renamed 'e' to 'd'
            d.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        DatabaseConnectionExample example = new DatabaseConnectionExample();
        Connection conn = example.showBug("jdbc:mysql://localhost:3306/mydatabase", "root");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}