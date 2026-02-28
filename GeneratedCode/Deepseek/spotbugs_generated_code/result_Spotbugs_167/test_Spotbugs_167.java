import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class SqlBugTest {
    @Test
    public void testShowBug() throws SQLException {
        // TRIGGER BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        SqlBug.showBug("John Doe'); DROP TABLE USERS; --");
    }
}