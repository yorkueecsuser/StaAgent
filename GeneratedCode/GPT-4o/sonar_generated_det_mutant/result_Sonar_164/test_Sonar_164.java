import org.junit.Test;
import static org.junit.Assert.*;

public class FloatingPointEqualityBugTest {

    @Test
    public void testShowBug() {
        FloatingPointEqualityBug bugInstance = new FloatingPointEqualityBug();
        assertTrue(bugInstance.showBug(3.146f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
    
    @Test
    public void testShowBug2() {
        FloatingPointEqualityBug bugInstance = new FloatingPointEqualityBug();
        assertFalse(bugInstance.showBug2(3.146f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
    
    @Test
    public void testShowBug3() {
        FloatingPointEqualityBug bugInstance = new FloatingPointEqualityBug();
        assertFalse(bugInstance.showBug3(0.0f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
    
    @Test
    public void testShowBug4() {
        FloatingPointEqualityBug bugInstance = new FloatingPointEqualityBug();
        assertFalse(bugInstance.showBug4(4.0f)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
    
    @Test
    public void testShowBug5() {
        FloatingPointEqualityBug bugInstance = new FloatingPointEqualityBug();
        assertFalse(bugInstance.showBug5(0.0f, 0.0d)); // TRIGGER BUG: Floating point numbers should not be tested for equality
    }
}