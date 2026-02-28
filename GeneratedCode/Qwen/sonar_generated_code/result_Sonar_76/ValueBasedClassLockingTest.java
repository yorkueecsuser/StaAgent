import org.junit.Test;
import static org.junit.Assert.*;

public class ValueBasedClassLockingTest {

    @Test
    public void testShowBug() {
        ValueBasedClassLocking example = new ValueBasedClassLocking();
        String result = example.showBug();  // TRIGGER BUG: Value-based classes should not be used for locking
        assertEquals("Hello", result);
    }
}