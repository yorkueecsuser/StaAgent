import org.junit.Test;
import static org.junit.Assert.*;

public class PointerEqualityBugTest {
    @Test
    public void testShowBug() {
        Object object1 = new Object();
        String object2 = "Hello World";

        // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        boolean result = object1 == object2;

        // Check if the result is true, which means the objects are equal
        assertFalse(result);
    }
}