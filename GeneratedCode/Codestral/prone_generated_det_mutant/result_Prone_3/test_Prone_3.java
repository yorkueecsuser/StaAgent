import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFillIncompatibleTypeBugTest {
    @Test
    public void testShowBug() {
        try {
            ArrayFillIncompatibleTypeBug.showBug(); // TRIGGER BUG: ArrayFillIncompatibleType
            fail("Expected an ArrayStoreException to be thrown");
        } catch (ArrayStoreException e) {
            // Expected exception, do nothing.
        }
    }
}