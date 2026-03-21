import org.junit.*;
import static org.junit.Assert.*;
import java.sql.*;

public class EmptyDatabasePasswordBugTest {

    @Test
    public void testEmptyDatabasePasswordBug() {
        // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        String dbURL = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = ""; 

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException ex) {
            // Expect an SQLException to be thrown because of empty database password
            fail("Expected an SQLException to be thrown");
        }
    }
}