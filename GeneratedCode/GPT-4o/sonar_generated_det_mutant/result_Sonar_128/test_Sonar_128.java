import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingExampleTest {

    @Test
    public void testDoubleCheckedLockingBug() {
        DoubleCheckedLockingExample example = DoubleCheckedLockingExample.getInstance();
        String output1 = example.showBug(); // TRIGGER BUG: Double-checked locking should not be used
        String output2 = example.showBug(); // TRIGGER BUG: Double-checked locking should not be used
        assertEquals(output1, output2);
    }
}