import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileNonPrimitiveExampleTest {

    @Test
    public void testShowBug() {
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample();
        assertEquals(3, example.showBug(2)); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }

    @Test
    public void testShowBugOutOfBounds() {
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample();
        assertEquals(-1, example.showBug(10)); // This test should pass as the index is out of bounds
    }

    @Test
    public void testShowBug2() {
        VolatileNonPrimitiveExample example = new VolatileNonPrimitiveExample();
        assertEquals(10, example.showBug2()); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }
}