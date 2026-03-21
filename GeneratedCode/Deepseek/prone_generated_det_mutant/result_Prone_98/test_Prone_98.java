import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Formatter;

public class LenientFormatStringValidationTest {
    @Test
    public void testShowBug() {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        String name = "John";
        String formatted = String.format("Hello, %s", name, "extra argument"); // TRIGGER BUG: LenientFormatStringValidation
        // The above line triggers the bug because three arguments are provided to String.format, but only two format specifiers are present.
    }
}