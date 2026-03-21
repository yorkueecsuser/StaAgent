import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyInputStreamTest {

    @Test
    public void testShowBugWithNegativeByteValue() {
        byte[] inputData = {(byte) 130}; // Byte value 130 should translate to -126
        BuggyInputStream stream = new BuggyInputStream(inputData);
        int result = stream.showBug(inputData); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals("Expected unsigned byte value but got a signed one", 130, result);
    }

    @Test
    public void testShowBugWithPositiveByteValue() {
        byte[] inputData = {120}; // A positive byte value
        BuggyInputStream stream = new BuggyInputStream(inputData);
        int result = stream.showBug(inputData); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals("Expected byte value to match input data", 120, result);
    }
}