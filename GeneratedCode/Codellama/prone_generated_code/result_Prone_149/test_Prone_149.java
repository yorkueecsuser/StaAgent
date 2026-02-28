import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentTest {
    @Test
    public void testBugTrigger() {
        SelfAssignment selfAssignment = new SelfAssignment();
        selfAssignment.showBug();
        // TRIGGER BUG: SelfAssignment
        selfAssignment.setName("Jane");
        assertEquals("Jane", selfAssignment.getName());
    }
}