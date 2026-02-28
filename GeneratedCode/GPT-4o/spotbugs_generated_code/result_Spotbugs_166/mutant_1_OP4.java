import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            
            // Unreachable if-else statement
            boolean condition = getCondition(); // Helper method to ensure condition is not a compile-time constant
            if (condition) {
                System.out.println("This block is unreachable.");
            } else {
                System.out.println("Unreachable if-else statement added.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Helper method to avoid compile-time constant
    private boolean getCondition() {
        return false;
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