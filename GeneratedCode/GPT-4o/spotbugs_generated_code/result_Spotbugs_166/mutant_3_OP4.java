import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Mutation: Unreachable if-else statement
        boolean condition = reachabilityCheck(); // Use non-final method call to ensure compile-time check is bypassed
        if (condition) {
            System.out.println("This block is never reached.");
        } else {
            System.out.println("This is the else block which is always executed.");
        }

        return connection;
    }

    private boolean reachabilityCheck() {
        return false; // Simulates an unreachable condition
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