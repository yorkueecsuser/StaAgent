import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class PrintfMismatchTest {
    @Test(expected = java.util.IllegalFormatConversionException.class)
    public void testStringInsteadOfInteger() {
        // TRIGGER BUG: CHECKERS_PRINTF_ARGS
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        new PrintfMismatch().showBug(System.out);
    }
}