import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileExampleTest {

    @Test
    public void testVolatileIntArray() {
        VolatileExample example = new VolatileExample(5);
        example.showBug1(0, 10); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(10, example.showBug1(0, 20)); // This will pass, but the underlying issue remains
        assertEquals(10, example.showBug1(0, 0)); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }

    @Test
    public void testVolatileObject() {
        VolatileExample example = new VolatileExample(5);
        example.showBug2("Initial"); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals("Updated", example.showBug2("Updated")); // This will pass, but the underlying issue remains
        assertEquals("Initial", example.showBug2("Initial")); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }
}