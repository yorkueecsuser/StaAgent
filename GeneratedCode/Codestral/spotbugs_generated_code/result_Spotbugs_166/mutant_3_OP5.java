import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // Bug: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    private boolean alwaysFalse() {
        return false;
    }

    public Connection showBug() throws SQLException {
        if (alwaysFalse()) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("This case is unreachable due to the unreachable switch statement.");
                    break;
            }
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