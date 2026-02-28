import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            
            // Introduce a non-final variable for switch statement to avoid compile-time constant
            int unreachableSwitchCondition = getSwitchCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("This code is unreachable but does not cause compile errors.");
                    break;
                default:
                    // No action
                    break;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Method to simulate dynamic runtime behavior for the switch condition
    private int getSwitchCondition() {
        return 2; // Always returns a value not matching any case
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