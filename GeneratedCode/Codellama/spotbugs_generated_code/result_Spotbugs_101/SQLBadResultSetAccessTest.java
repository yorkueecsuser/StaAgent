import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

public class SQLBadResultSetAccessTest {
    @Test
    public void testBug() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // TRIGGER BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
            String username = rs.getString(0);

            fail("Expected exception was not thrown");
        } catch (SQLException e) {
            assertEquals(SQLException.class, e.getClass());
            assertEquals("SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)", e.getMessage());
        }
    }
}