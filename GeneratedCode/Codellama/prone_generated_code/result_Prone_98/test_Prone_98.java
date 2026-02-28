import org.junit.Test;
import static org.junit.Assert.*;

public class LenientFormatStringValidationTest {
    @Test
    public void testBug() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String message = String.format("Hello, %s", names[0], names[1], names[2]);
        assertEquals("Hello, Alice", message);
    }

    @Test
    public void testBugWithMoreArguments() {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        String message = String.format("Hello, %s", names[0], names[1], names[2], names[3]);
        assertEquals("Hello, Alice", message);
    }

    @Test
    public void testBugWithLessArguments() {
        String[] names = {"Alice", "Bob"};
        String message = String.format("Hello, %s", names[0], names[1]);
        assertEquals("Hello, Alice", message);
    }
}