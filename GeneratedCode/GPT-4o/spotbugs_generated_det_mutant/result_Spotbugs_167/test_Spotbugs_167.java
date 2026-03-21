import org.junit.Test;
import static org.junit.Assert.*;

public class SQLNonconstantQueryExampleTest {

    @Test
    public void testShowBug() {
        // Intentionally triggering the bug by passing nonconstant strings to showBug method
        SQLNonconstantQueryExample.showBug("Users", "admin"); // TRIGGER BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)
    }
}