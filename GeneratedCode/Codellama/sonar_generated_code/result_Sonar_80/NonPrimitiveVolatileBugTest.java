import org.junit.Test;
import static org.junit.Assert.*;

public class NonPrimitiveVolatileBugTest {
    @Test
    public void testBug() {
        NonPrimitiveVolatileBug bug = new NonPrimitiveVolatileBug();
        bug.showBug();
        // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(5, bug.vInts.length);
        assertEquals(0, bug.myObj.getId());
    }
}