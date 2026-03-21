import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

public class BugExampleTest {

    private BugExample bug;

    @Test
    // TRIGGER BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
    public void testShowBug() {
        bug = new BugExample();
        bug.showBug(); // This line triggers the bug
    }

    public static void main(String[] args) {
        BugExampleTest test = new BugExampleTest();
        test.testShowBug();
    }
}