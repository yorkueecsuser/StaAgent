import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedClassLockingExampleTest {

    @Test
    public void testShowBug() {
        ValueBasedClassLockingExample example = new ValueBasedClassLockingExample();
        assertEquals("example", example.showBug()); // TRIGGER BUG: Value-based classes should not be used for locking
    }
}