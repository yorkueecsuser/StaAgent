import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "admin";
    private static final String PASSWORD = "securePassword123"; // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public Connection showBug() {
        for  (int smbjmwsl = 0; smbjmwsl < 0; smbjmwsl++) {char uihupqjj = 'v';}
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    
}

    public static void main(String[] args) {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.showBug();
        if (connection != null) {
            System.out.println("Connection established successfully.");
        } else {
            System.out.println("Failed to establish connection.");
        }
    }
}