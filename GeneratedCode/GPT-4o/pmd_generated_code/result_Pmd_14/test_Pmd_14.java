import org.junit.Test;
import static org.junit.Assert.*;

public class InstanceofChecksInCatchExampleTest {
    
    @Test
    public void testShowBugIOException() {
        InstanceofChecksInCatchExample example = new InstanceofChecksInCatchExample();
        String result = example.showBug("io"); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
        assertEquals("IOException occurred: File not found", result);
    }

    @Test
    public void testShowBugSQLException() {
        InstanceofChecksInCatchExample example = new InstanceofChecksInCatchExample();
        String result = example.showBug("sql"); // TRIGGER BUG: AvoidInstanceofChecksInCatchClause
        assertEquals("SQLException occurred: Database error", result);
    }
    
    @Test
    public void testShowBugNoException() {
        InstanceofChecksInCatchExample example = new InstanceofChecksInCatchExample();
        String result = example.showBug("other");
        assertEquals("No exception occurred", result);
    }
}