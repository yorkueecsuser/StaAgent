import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceofInCatchClauseTest {

    @Test
    public void testShowBugWithNonExistentFile() {
        InstanceofInCatchClause example = new InstanceofInCatchClause();
        String result = example.showBug("nonexistentfile.txt"); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
        assertEquals("File not found.", result);
    }

    @Test
    public void testShowBugWithIOError() {
        InstanceofInCatchClause example = new InstanceofInCatchClause();
        String result = example.showBug("/dev/null"); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
        assertEquals("IO Exception occurred.", result);
    }
}