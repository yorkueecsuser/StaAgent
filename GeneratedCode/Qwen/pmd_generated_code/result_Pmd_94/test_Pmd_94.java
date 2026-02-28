import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingExampleTest {

    @Test
    public void testDoubleCheckedLocking() {
        DoubleCheckedLockingExample example = new DoubleCheckedLockingExample();
        assertNotNull(example.showBug()); // TRIGGER BUG: DoubleCheckedLocking
    }
}