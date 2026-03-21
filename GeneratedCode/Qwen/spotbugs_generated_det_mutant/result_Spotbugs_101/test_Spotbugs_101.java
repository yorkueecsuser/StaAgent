import org.junit.Test;
import static org.junit.Assert.*;

public class ResultSetBugExampleTest {

    @Test
    public void testShowBugWithIndexZero() {
        ResultSetBugExample example = new ResultSetBugExample();
        // Using a dummy database URL, user, password, and query for testing purposes
        String url = "jdbc:mysql://dummy:3306/testdb";
        String user = "dummy";
        String password = "dummy";
        String query = "SELECT name FROM users WHERE id = 1";
        // TRIGGER BUG: SQL: Method attempts to access a result set field with index 0 (SQL_BAD_RESULTSET_ACCESS)
        example.showBug(url, user, password, query);
    }
}