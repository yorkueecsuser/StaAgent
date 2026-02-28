import org.junit.Test;
import static org.junit.Assert.*;

public class PreparedStatementResultSetBugDemoTest {

    @Test
    public void testShowBug() {
        PreparedStatementResultSetBugDemo demo = new PreparedStatementResultSetBugDemo();
        
        // Intentionally triggering the bug by calling showBug
        demo.showBug(); // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
    }
}