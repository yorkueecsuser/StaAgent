import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveComparisonTest {

    @Test
    public void testShowBugWithCachedIntegers() {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        Integer a = 127;
        Integer b = 127;
        assertTrue("Expected true because 127 is within the cache range", example.showBug(a, b)); // TRIGGER BUG: BoxedPrimitiveEquality
    }

    @Test
    public void testShowBugWithNonCachedIntegers() {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        Integer a = 128;
        Integer b = 128;
        assertTrue("Expected true based on value equality but got false due to reference equality", example.showBug(a, b)); // TRIGGER BUG: BoxedPrimitiveEquality
    }
}