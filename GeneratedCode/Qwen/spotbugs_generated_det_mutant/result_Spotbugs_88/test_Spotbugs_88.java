import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testShowBugTriggersSelfAssignment() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        int result = bugDemo.showBug(); // TRIGGER BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        assertEquals(5, result); // This will fail because showBug() returns the original value, not 5
    }
}