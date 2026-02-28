import org.junit.Test;
import static org.junit.Assert.*;

public class PreparedStatementBugExampleTest {

    @Test
    public void testShowBugWithInvalidIndexInPreparedStatement() {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        // This call will trigger the bug in PreparedStatement by using an invalid index
        example.showBug("jdbc:mysql://localhost:3306/mydb", "root", "password"); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    }

    @Test
    public void testShowBugWithInvalidIndexInResultSet() {
        PreparedStatementBugExample example = new PreparedStatementBugExample();
        // This call will trigger the bug in ResultSet by using an invalid index
        example.showBug("jdbc:mysql://localhost:3306/mydb", "root", "password"); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    }
}