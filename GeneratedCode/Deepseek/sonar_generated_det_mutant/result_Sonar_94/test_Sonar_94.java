import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        // TRIGGER BUG: "PreparedStatement" and "ResultSet" methods should be called with valid indices
        bugExample.showBug(); // This will trigger the bug
    }
}