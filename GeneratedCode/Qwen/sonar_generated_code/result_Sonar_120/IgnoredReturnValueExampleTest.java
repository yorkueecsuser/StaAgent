import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

class IgnoredReturnValueExampleTest {

    @Test
    public void testHandle() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.showBug("HelloWorld"); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testProcessNumbers() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        assertEquals(0, example.showBug1(new ArrayList<>())); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }

    @Test
    public void testCheckOptional() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        assertEquals("", example.showBug2(java.util.Optional.of("Present"))); // TRIGGER BUG: Return values from functions without side effects should not be ignored
    }
}