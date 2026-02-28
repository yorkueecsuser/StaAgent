import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbConnectTest {
    @Test
    public void testEmptyPassword() {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            fail("Expected an SQLException to be thrown");
        } catch (SQLException e) {
            assertEquals("08001", e.getSQLState());
            assertEquals("The server requested password-based authentication, but no password was provided.", e.getMessage());
        }
    }
}