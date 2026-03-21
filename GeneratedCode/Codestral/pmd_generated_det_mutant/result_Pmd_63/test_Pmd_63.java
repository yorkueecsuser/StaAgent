import org.junit.Test;
import static org.junit.Assert.*;

public class NullAssignmentBugTest {
    @Test
    public void testDemonstrateBug() {
        NullAssignmentBug buggyClass = new NullAssignmentBug();
        Object result = buggyClass.showBug();
        assertNotNull("Failed to trigger NullAssignment bug. Object should not be null.", result);
        // TRIGGER BUG: NullAssignment
    }
}