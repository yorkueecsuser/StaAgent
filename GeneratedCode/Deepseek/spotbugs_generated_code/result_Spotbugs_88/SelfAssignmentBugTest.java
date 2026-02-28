import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {
    @Test
    public void testShowBug() {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        int result = bug.showBug();
        assertEquals("Self assignment should not change the value", 10, result);
        // TRIGGER BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }
}