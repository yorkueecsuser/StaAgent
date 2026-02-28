import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.fail;

public class FinalizeOverloadedTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testFinalizeOverloaded() {
        System.setOut(new PrintStream(outContent));
        FinalizeOverloaded.showBug();
        String expectedOutput = "This is confusing and probably a bug\n";
        String actualOutput = outContent.toString();
        if (!actualOutput.equals(expectedOutput)) {
            fail("Expected output: " + expectedOutput + ", but got: " + actualOutput);
        }
    }
}