import org.junit.Test;
import static org.junit.Assert.*;

class BuggyPreparedStatementTest {
    @Test
    public void testBug() {
        String[] args = new String[]{"1"};
        BuggyPreparedStatement.showBug(args);
        // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        assertTrue(true);
    }
}