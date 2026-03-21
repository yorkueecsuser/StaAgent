import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveWrapperTernaryBugTest {

    @Test
    public void testShowBugConditionTrue() {
        PrimitiveWrapperTernaryBug example = new PrimitiveWrapperTernaryBug();
        Number result = example.showBug(true, 5, 3.2);
        assertEquals(5, result); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }

    @Test
    public void testShowBugConditionFalse() {
        PrimitiveWrapperTernaryBug example = new PrimitiveWrapperTernaryBug();
        Number result = example.showBug(false, 5, 3.2);
        assertEquals(3.2, result); // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    }
}