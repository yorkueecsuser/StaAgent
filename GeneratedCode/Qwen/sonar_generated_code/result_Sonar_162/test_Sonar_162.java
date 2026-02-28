import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testShowBug() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        bugDemo.showBug("John Doe"); // TRIGGER BUG: Variables should not be self-assigned
        assertNull(bugDemo.showBug("John Doe"));
    }
}