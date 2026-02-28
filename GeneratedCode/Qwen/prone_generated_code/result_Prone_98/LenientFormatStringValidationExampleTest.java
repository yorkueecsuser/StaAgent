import org.junit.Test;
import static org.junit.Assert.*;

public class LenientFormatStringValidationExampleTest {

    @Test
    public void testShowBug() {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        // TRIGGER BUG: LenientFormatStringValidation
        assertEquals("Name: Alice, Age: 30", example.showBug("Alice", 30)); // This will fail due to incorrect number of arguments
    }

    @Test
    public void testShowBug1() {
        LenientFormatStringValidationExample example = new LenientFormatStringValidationExample();
        // TRIGGER BUG: LenientFormatStringValidation
        example.showBug1("test"); // This will log a message with an extra argument which will be ignored
    }
}