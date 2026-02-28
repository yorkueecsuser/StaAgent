import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String a = "jdbc:mysql://localhost/test";
    private static final String b = "root";
    private static final String c = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    public Connection showBug() throws SQLException {
        return DriverManager.getConnection(a, b, c);
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