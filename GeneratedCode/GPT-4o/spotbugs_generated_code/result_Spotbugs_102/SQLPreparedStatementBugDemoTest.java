import org.junit.Test;
import static org.junit.Assert.*;

public class SQLPreparedStatementBugDemoTest {

    @Test
    public void testShowBug() {
        SQLPreparedStatementBugDemo demo = new SQLPreparedStatementBugDemo();
        demo.showBug("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        // TRIGGER BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
    }
}