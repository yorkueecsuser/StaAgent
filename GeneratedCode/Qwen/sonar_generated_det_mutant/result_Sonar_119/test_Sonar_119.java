import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEqualsBugTest {

    @Test
    public void testShowBugWithSameValue() {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger num1 = new AtomicInteger(10);
        AtomicInteger num2 = new AtomicInteger(10);
        
        assertTrue(bugDemo.showBug(num1, num2)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    @Test
    public void testShowBugWithDifferentObjectsSameValue() {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger num1 = new AtomicInteger(10);
        AtomicInteger num2 = new AtomicInteger(10);
        
        assertTrue(bugDemo.showBug(num1, num2)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    @Test
    public void testShowBugWithDifferentValues() {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger num1 = new AtomicInteger(10);
        AtomicInteger num2 = new AtomicInteger(20);
        
        assertFalse(bugDemo.showBug(num1, num2)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }
}