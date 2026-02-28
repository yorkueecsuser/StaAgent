import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedLockingExampleTest {

    @Test
    public void testShowBug() {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug(); // TRIGGER BUG: Value-based classes should not be used for locking
    }
}