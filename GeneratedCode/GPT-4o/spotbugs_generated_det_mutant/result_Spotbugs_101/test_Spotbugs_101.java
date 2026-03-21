import org.junit.Test;
import static org.junit.Assert.*;

public class SQLBadResultSetAccessExampleTest {

    @Test
    public void testShowBug() {
        SQLBadResultSetAccessExample example = new SQLBadResultSetAccessExample();
        // TRIGGER BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
        String result = example.showBug();
        fail("Expected SQLException due to accessing ResultSet with index 0");
    }
}