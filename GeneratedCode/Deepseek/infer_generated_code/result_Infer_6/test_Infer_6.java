import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintfArgsBugTest {
    @Test
    public void testStringInsteadOfInteger() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintfArgsBug bug = new PrintfArgsBug();
        bug.showBug(); // TRIGGER BUG: CHECKERS_PRINTF_ARGS

        // Assert that the printf operation has failed
        assertTrue(outContent.toString().contains("Exception in thread \"main\" java.util.IllegalFormatConversionException"));
    }
}