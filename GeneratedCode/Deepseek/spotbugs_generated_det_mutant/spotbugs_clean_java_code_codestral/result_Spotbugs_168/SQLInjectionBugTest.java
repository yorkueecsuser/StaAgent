import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;

public class SQLInjectionBugTest {
    @Test
    public void testShowBug() throws SQLException {
        SQLInjectionBug bug = new SQLInjectionBug();
        String input = "' OR '1'='1"; // TRIGGER BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        bug.showBug(input);
    }
}