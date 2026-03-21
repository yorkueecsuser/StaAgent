import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileCompoundOperatorBugTest {

    @Test
    public void testShowBugWithMultipleIterations() {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        String result = bugDemo.showBug(100); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        // Assert to deliberately fail the test, showcasing the non-atomic behavior
        assertEquals("Count: 100, Boo: false", result);
    }

    @Test
    public void testShowBugConsistency() {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        String firstRun = bugDemo.showBug(100); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        String secondRun = bugDemo.showBug(100); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        // Assert to deliberately fail the test, showcasing the inconsistency
        assertEquals(firstRun, secondRun);
    }
}