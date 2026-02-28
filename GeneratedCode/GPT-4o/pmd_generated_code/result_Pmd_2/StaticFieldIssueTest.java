import org.junit.Test;
import static org.junit.Assert.*;

public class StaticFieldIssueTest {

    @Test
    public void testShowBugWithConcurrentInstances() {
        StaticFieldIssue example1 = new StaticFieldIssue(10); // TRIGGER BUG: AssignmentToNonFinalStatic
        assertEquals(10, example1.showBug(30)); // TRIGGER BUG: AssignmentToNonFinalStatic

        StaticFieldIssue example2 = new StaticFieldIssue(20); // TRIGGER BUG: AssignmentToNonFinalStatic
        assertEquals(20, example2.showBug(40)); // TRIGGER BUG: AssignmentToNonFinalStatic
    }
}