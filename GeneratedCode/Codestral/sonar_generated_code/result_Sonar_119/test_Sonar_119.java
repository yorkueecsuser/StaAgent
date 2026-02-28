import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEqualsBugTest {
    @Test
    public void testShowBug() {
        AtomicEqualsBug bug = new AtomicEqualsBug();
        AtomicInteger a = new AtomicInteger(5);
        AtomicInteger b = new AtomicInteger(5);
        assertFalse(bug.showBug(a, b)); // TRIGGER BUG: ".equals()" should not be used to test the values of "Atomic" classes
    }
}