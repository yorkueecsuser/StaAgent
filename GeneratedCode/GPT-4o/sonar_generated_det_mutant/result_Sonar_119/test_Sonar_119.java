import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicComparisonTest {

    @Test
    public void testShowBug() {
        AtomicComparison example = new AtomicComparison();
        
        // This test is expected to fail
        // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
        assertTrue(example.showBug(5, 5));
    }

    @Test
    public void testShowBugWithLong() {
        AtomicComparison example = new AtomicComparison();
        
        // This test is expected to fail
        // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
        assertTrue(example.showBugWithLong(10L, 10L));
    }
}