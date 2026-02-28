import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);

            // Mutation: Add an unreachable if-else statement
            boolean dynamicCondition = getDynamicCondition(); // This method is used to ensure the condition is not a compile-time constant
            if (dynamicCondition) {
                System.out.println("This block is unreachable because dynamicCondition is always false.");
            } else {
                System.out.println("This block will always execute because dynamicCondition is always false.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private boolean getDynamicCondition() {
        return false; // Ensures the if block is unreachable
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