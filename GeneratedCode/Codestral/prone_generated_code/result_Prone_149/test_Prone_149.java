import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {
    @Test
    public void testSelfAssignmentBug() {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.showBug(); // TRIGGER BUG: SelfAssignment
        assertEquals("Value of x after self assignment: 10", bug.getOutput()); // This assertion will fail due to the bug in the code
    }

    // This is a mock method to retrieve the output of the showBug method for testing
    private class SelfAssignmentBug {
        private String output;

        public void showBug() {
            int x = 10;
            x = x; // BUG: SelfAssignment
            output = "Value of x after self assignment: " + x;
        }

        public String getOutput() {
            return output;
        }
    }
}