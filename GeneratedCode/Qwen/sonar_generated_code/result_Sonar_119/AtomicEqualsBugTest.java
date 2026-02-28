import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEqualsBugTest {

    @Test
    public void testShowBugWithDifferentInstances() {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger int1 = new AtomicInteger(10);
        AtomicInteger int2 = new AtomicInteger(10);
        
        assertFalse(bugDemo.showBug(int1, int2)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }

    @Test
    public void testShowBugWithSameInstance() {
        AtomicEqualsBug bugDemo = new AtomicEqualsBug();
        AtomicInteger int1 = new AtomicInteger(10);
        AtomicInteger int2 = int1;
        
        assertTrue(bugDemo.showBug(int1, int2)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }
}