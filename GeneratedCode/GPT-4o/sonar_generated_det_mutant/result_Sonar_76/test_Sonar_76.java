import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class ValueBasedLockingExampleTest {

    @Test
    public void testShowBug() {
        ValueBasedLockingExample example = new ValueBasedLockingExample();
        example.showBug(); // TRIGGER BUG: Value-based classes should not be used for locking
    }
}