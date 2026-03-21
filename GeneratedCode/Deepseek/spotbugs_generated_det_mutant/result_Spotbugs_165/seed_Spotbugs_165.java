import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class BuggyCode {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DATABASE_USER = "myuser";
    private static final String DATABASE_PASSWORD = "hardcoded_password"; // BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

    public Connection showBug() throws SQLException {
        Connection conn = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        return conn;
    }
}