import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class InexactVarargsConditionalBugTest {

    @Test
    public void testShowBugTrue() {
        String expected = "[1, 2]";
        String actual = captureOutput(() -> InexactVarargsConditionalBug.showBug(true)); // TRIGGER BUG: InexactVarargsConditional
        assertEquals(expected, actual);
    }

    @Test
    public void testShowBugFalse() {
        String expected = "[3]";
        String actual = captureOutput(() -> InexactVarargsConditionalBug.showBug(false)); // TRIGGER BUG: InexactVarargsConditional
        assertEquals(expected, actual);
    }

    private String captureOutput(Runnable runnable) {
        // Redirect standard error to a byte array output stream
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        System.setErr(new java.io.PrintStream(bos));

        // Execute the runnable
        runnable.run();

        // Restore standard error
        System.setErr(System.err);

        // Return the captured output
        return bos.toString().trim();
    }
}