import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    public Connection showBug() throws SQLException {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code block
            throw new IllegalStateException("This code should never be executed");
        } else {
            // Original code block
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }
    }

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        try {
            Connection conn = connection.showBug();
            // Code using the connection
        } catch (SQLException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}