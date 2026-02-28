import org.junit.Test;
import static org.junit.Assert.*;

public class BoxedPrimitiveEqualityBugTest {
    BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();

    @Test
    public void testBoxedPrimitiveEqualityBug() {
        Integer a = 1000; // Outside of cached range for autoboxing
        Integer b = 1000; // Outside of cached range for autoboxing
        assertEquals(new Integer(1), bug.showBug(a, b)); // TRIGGER BUG: BoxedPrimitiveEquality
    }
}