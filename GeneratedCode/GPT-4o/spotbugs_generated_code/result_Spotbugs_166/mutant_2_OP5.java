import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnectionExample {

    public Connection showBug(String url, String user) {
        String password = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);

            // Start of mutant: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This case is never reached.");
                    break;
                case 2:
                    System.out.println("Neither is this case.");
                    break;
                default:
                    System.out.println("Default case is also unreachable.");
            }
            // End of mutant: Unreachable switch statement

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int getUnreachableValue() {
        return 3; // Value that doesn't match any switch cases
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