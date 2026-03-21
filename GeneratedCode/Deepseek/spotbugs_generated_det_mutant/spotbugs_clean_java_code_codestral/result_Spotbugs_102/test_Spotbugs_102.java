import org.junit.Test;
import static org.junit.Assert.*;

public class BadPreparedStatementAccessTest {

    @Test
    public void testShowBug() throws Exception {
        BadPreparedStatementAccess badAccess = new BadPreparedStatementAccess();

        // TRIGGER BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        badAccess.showBug();
    }
}