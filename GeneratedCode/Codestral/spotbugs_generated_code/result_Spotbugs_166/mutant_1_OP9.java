import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
    private static final int MAX_ATTEMPTS = 5;

    public Connection showBug() throws SQLException {
        int attempts = 0;
        Connection conn = null;

        do {
            try {
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            } catch (SQLException e) {
                System.err.println("Connection failed. Attempting again...");
                attempts++;
            }
        } while (conn == null && attempts < MAX_ATTEMPTS);

        if (conn == null) {
            throw new SQLException("Could not establish a database connection after " + MAX_ATTEMPTS + " attempts.");
        }

        return conn;
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