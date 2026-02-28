import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class UnconditionalIfStatementBugTest {
    // Test case to trigger the bug
    @Test
    public void testShowBug() {
        UnconditionalIfStatementBug bug = new UnconditionalIfStatementBug();
        ArrayList<String> result = bug.showBug();
        assertTrue(result.contains("Example value"));
        // TRIGGER BUG: UnconditionalIfStatement
    }
}