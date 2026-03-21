import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {
    private SelfAssignmentBug selfAssignmentBug = new SelfAssignmentBug();

    @Test
    public void testShowBug() {
        int input = 5;
        int expectedOutput = 0;
        int actualOutput = selfAssignmentBug.showBug(input);
        assertEquals(expectedOutput, actualOutput);
        // TRIGGER BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }
}