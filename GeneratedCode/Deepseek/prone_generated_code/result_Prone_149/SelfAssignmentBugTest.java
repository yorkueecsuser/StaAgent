import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {
    @Test
    public void testShowBug() {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        assertNotEquals(bug.showBug(5), 5); // TRIGGER BUG: SelfAssignment
    }
}