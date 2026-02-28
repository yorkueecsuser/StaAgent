import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    // Original method with the bug
    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Mutated method with renamed variable
    public Connection showBugMutant(String u, String v) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection c = null;
        try {
            c = DriverManager.getConnection(u, v, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        DatabaseConnectionExample example = new DatabaseConnectionExample();
        // Using original method
        Connection conn = example.showBug("jdbc:mysql://localhost:3306/mydatabase", "root");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to connect to the database.");
        }

        // Using mutated method
        Connection connMutant = example.showBugMutant("jdbc:mysql://localhost:3306/mydatabase", "root");
        if (connMutant != null) {
            System.out.println("Connected to the database using mutant method!");
        } else {
            System.out.println("Failed to connect to the database using mutant method.");
        }
    }
}