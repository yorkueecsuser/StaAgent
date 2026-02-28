import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyBufferTest {
    @Test
    public void testExposeInternalRepresentation() {
        byte[] input = {1, 2, 3, 4, 5};
        BuggyBuffer buggyBuffer = new BuggyBuffer(input);

        byte[] result = buggyBuffer.showBug();

        // Modify the input array after creating the BuggyBuffer object
        input[0] = 10;

        // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        assertEquals("The internal representation of BuggyBuffer is exposed", 10, result[0]);
    }
}