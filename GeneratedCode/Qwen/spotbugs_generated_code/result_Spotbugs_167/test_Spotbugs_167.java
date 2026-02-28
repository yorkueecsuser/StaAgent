import org.junit.Test;
import java.sql.SQLException;

public class SQLNonConstantStringExampleTest {

    @Test(expected = SQLException.class)
    public void testShowBugWithMaliciousInput() throws SQLException {
        SQLNonConstantStringExample example = new SQLNonConstantStringExample();
        try {
            example.showBug("admin' -- "); // TRIGGER BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
        } catch (SQLException e) {
            throw e; // Re-throw the exception to ensure the test fails
        }
    }
}