import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        // We expect the method to return an array of size 10
        int[] expected = new int[10];

        // The showBug method should return an array of size 10
        int[] actual = bugExample.showBug();
        assertEquals(expected.length, actual.length);

        // TRIGGER BUG: AvoidBranchingStatementAsLastInLoop
        // This test case fails because the last part of the loop is a branching statement
        // The loop should not have a branching statement as the last part
        if (actual[0] == 0) {
            fail("The test case should fail due to the bug in showBug method");
        }
    }
}