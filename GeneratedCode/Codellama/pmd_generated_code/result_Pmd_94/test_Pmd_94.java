import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingTest {
    @Test
    public void testShowBug() {
        DoubleCheckedLocking obj = DoubleCheckedLocking.getInstance();
        obj.showBug(); // TRIGGER BUG: DoubleCheckedLocking
    }
}