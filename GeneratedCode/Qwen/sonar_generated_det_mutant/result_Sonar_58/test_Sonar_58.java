import org.junit.Test;
import static org.junit.Assert.*;

public class InputStreamBugExampleTest {

    @Test
    public void testShowBugWithNegativeByte() throws Exception {
        InputStreamBugExample example = new InputStreamBugExample(new byte[] {(byte) -1});
        int result = example.showBug(); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals(255, result); // This assertion will fail, demonstrating the bug
    }

    @Test
    public void testShowBugWithPositiveByte() throws Exception {
        InputStreamBugExample example = new InputStreamBugExample(new byte[] {(byte) 127});
        int result = example.showBug(); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals(127, result); // This assertion will pass, but the method call still triggers the bug
    }

    @Test
    public void testShowBugWithZeroByte() throws Exception {
        InputStreamBugExample example = new InputStreamBugExample(new byte[] {(byte) 0});
        int result = example.showBug(); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals(0, result); // This assertion will pass, but the method call still triggers the bug
    }
}