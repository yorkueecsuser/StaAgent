import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;

public class PreparedStatementBugExampleTest {

    @Test
    public void testShowBugWithIndexZero() {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        try {
            example.showBug("jdbc:mysql://localhost:3306/mydb", "user", "password", "INSERT INTO users (name) VALUES (?)", "John Doe"); // TRIGGER BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
            fail("Expected SQLException to be thrown due to invalid parameter index");
        } catch (SQLException e) {
            // Expected exception
        }
    }
}