import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class SQLBadResultSetAccessTest {
    private SQLBadResultSetAccess sqlBadResultSetAccess;

    public SQLBadResultSetAccessTest() {
        sqlBadResultSetAccess = new SQLBadResultSetAccess();
    }

    @Test
    public void testShowBug() {
        // TRIGGER BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
        sqlBadResultSetAccess.showBug();
    }
}