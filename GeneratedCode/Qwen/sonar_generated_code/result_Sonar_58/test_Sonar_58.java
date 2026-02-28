import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class InputStreamBugExampleTest {

    @Test
    public void testReadFromInputStreamWithNegativeByte() throws IOException {
        InputStreamBugExample example = new InputStreamBugExample(new byte[]{(byte) -128});
        int result = example.showBug(new byte[]{(byte) -128}); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals(256 + (byte) -128, result); // This assertion will fail because the method returns a signed byte
    }

    @Test
    public void testReadFromInputStreamWithPositiveByte() throws IOException {
        InputStreamBugExample example = new InputStreamBugExample(new byte[]{(byte) 127});
        int result = example.showBug(new byte[]{(byte) 127}); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals(127, result); // This assertion will pass but demonstrates the bug presence
    }
}