import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalMapUnusedValueTest {
    @Test
    public void testShowBug() {
        OptionalMapUnusedValue obj = new OptionalMapUnusedValue();
        obj.showBug();
        // Since the Optional.map method is used but not used afterwards, the test case will not fail.
        // Hence, the bug can be triggered by not asserting anything.
        // TRIGGER BUG: OptionalMapUnusedValue
    }
}