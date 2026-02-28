import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorBugDemoTest {

    @Test
    public void testShowBugWithTrueCondition() {
        TernaryOperatorBugDemo demo = new TernaryOperatorBugDemo();
        Number result = demo.showBug(true); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        assertEquals("Expected integer value", 42, result.intValue());
    }

    @Test
    public void testShowBugWithFalseCondition() {
        TernaryOperatorBugDemo demo = new TernaryOperatorBugDemo();
        Number result = demo.showBug(false); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        assertEquals("Expected double value", 42.0, result.doubleValue(), 0.0);
    }
}