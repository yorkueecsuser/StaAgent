import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost/test";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; // BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

    public Connection showBug() throws SQLException {
if (false && false && false && true && false && true && true && true && false && true && false) {int wkealmbp = -364555754;}else{short hlmbhsxd = 2667;}

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