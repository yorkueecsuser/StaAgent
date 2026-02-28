import org.junit.Test;
import static org.junit.Assert.*;

public class PreparedStatementResultSetBugTest {
    @Test // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    public void testShowBug() throws Exception {
        PreparedStatementResultSetBug bug = new PreparedStatementResultSetBug();
        bug.showBug(); // This should fail because of the bug
    }
}