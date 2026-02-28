import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    private static boolean getCondition() {
        return false; // This always returns false, making the loop unreachable
    }

    public Connection showBug() throws SQLException {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable block of code");
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        try {
            Connection conn = connection.showBug();
            // Code using the connection
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}