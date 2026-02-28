import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointEqualityBugTest {

    @Test
    public void testShowBug1() {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        assertFalse(bugDemo.showBug1(3.146f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }

    @Test
    public void testShowBug2() {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        assertTrue(bugDemo.showBug2(3.146f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }

    @Test
    public void testShowBug3() {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        assertFalse(bugDemo.showBug3(4.0f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }

    @Test
    public void testShowBug4() {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        assertTrue(bugDemo.showBug4(0.0f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }

    @Test
    public void testShowBug6() {
        FloatingPointEqualityBug bugDemo = new FloatingPointEqualityBug();
        assertTrue(bugDemo.showBug6(Float.NaN, 0.0)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
}