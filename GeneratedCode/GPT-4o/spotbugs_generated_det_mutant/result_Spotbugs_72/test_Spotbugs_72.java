import org.junit.Test;
import static org.junit.Assert.*;

public class PointerEqualityBugExampleTest {

    @Test
    public void testPointerEqualityWithDifferentTypes() {
        PointerEqualityBugExample example = new PointerEqualityBugExample();
        
        String str = "example";
        Integer number = 123;

        // TRIGGER BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        boolean result = example.showBug(str, number);

        // This assertion will fail because the bug results in the method always returning false
        assertTrue("Expected true but got false due to pointer equality bug", result);
    }
}