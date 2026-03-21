import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    public Connection showBug() throws SQLException {
if (false && true && true && false && false && false && false && true && false && false && false) {double vksdrwqi = 560100314;}else{double dicwvlve = -757881230;}

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