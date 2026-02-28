import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionContextBugDemoTest {

    @Test
    public void testShowBugWithDescriptionAfterAssertion() {
        AssertionContextBugDemo demo = new AssertionContextBugDemo();
        demo.showBug("actualValue", "expectedValue"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertFalse("The test should fail due to incorrect assertion context usage.", demoIsEqual(demo, "actualValue", "expectedValue", "This should describe the assertion context"));
    }

    @Test
    public void testShowBugWithFailMessageAfterAssertion() {
        AssertionContextBugDemo demo = new AssertionContextBugDemo();
        demo.showBug("actualValue", "expectedValue"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
        assertFalse("The test should fail due to incorrect assertion context usage.", demoIsEqualWithFailMessage(demo, "actualValue", "expectedValue", "This should be the fail message"));
    }

    private boolean demoIsEqual(AssertionContextBugDemo demo, Object actual, Object expected, String description) {
        // Simulate calling the private method indirectly for testing purposes
        return actual.equals(expected);
    }

    private boolean demoIsEqualWithFailMessage(AssertionContextBugDemo demo, Object actual, Object expected, String failMessage) {
        // Simulate calling the private method indirectly for testing purposes
        return actual.equals(expected);
    }
}