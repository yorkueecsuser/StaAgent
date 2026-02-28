import org.junit.Test;
import static org.junit.Assert.*;

public class MathAbsBugDemoTest {

    @Test
    public void testShowBugWithMinValue() {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        assertEquals(0, demo.showBug("test")); // This should pass and not trigger the bug

        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MAX_VALUE, demo.showBug(new String(new char[Integer.MAX_VALUE]))); // This will not trigger the bug

        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MAX_VALUE + 1, demo.showBug(new String(new char[Integer.MAX_VALUE + 1]))); // This will not trigger the bug

        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MIN_VALUE, demo.showBug("a string that could hash to MIN_VALUE")); // This might trigger the bug depending on hashcode implementation
    }

    @Test
    public void testShowBug1WithMinValue() {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MIN_VALUE, demo.showBug1(Integer.MIN_VALUE)); // This will trigger the bug
    }

    @Test
    public void testShowBug2WithMinValue() {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Long.MIN_VALUE, demo.showBug2(Long.MIN_VALUE)); // This will trigger the bug
    }
}