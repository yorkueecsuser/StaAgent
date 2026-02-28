import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveEqualityExampleTest {

    @Test
    public void testShowBugWithCachedValues() {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        assertTrue(example.showBug(127, 127)); // TRIGGER BUG: BoxedPrimitiveEquality
    }

    @Test
    public void testShowBugWithUncachedValues() {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        assertFalse(example.showBug(128, 128)); // TRIGGER BUG: BoxedPrimitiveEquality
    }
}