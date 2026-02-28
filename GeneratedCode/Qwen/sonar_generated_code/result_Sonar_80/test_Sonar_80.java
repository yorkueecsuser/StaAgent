import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileExampleTest {

    @Test
    public void testShowBug1() {
        VolatileExample example = new VolatileExample(10);
        example.showBug1(0, 42); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(42, example.showBug1(0, 42)); // This assertion might pass, but the underlying issue remains
    }

    @Test
    public void testShowBug2() {
        VolatileExample example = new VolatileExample(10);
        example.showBug2("testData"); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals("testData", example.showBug2("testData")); // This assertion might pass, but the underlying issue remains
    }
}