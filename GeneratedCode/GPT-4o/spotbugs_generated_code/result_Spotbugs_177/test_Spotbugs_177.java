import org.junit.Test;
import static org.junit.Assert.*;

public class BufferExposureExampleTest {

    @Test
    public void testShowBug() {
        BufferExposureExample example = new BufferExposureExample(new byte[]{1, 2, 3, 4, 5});
        byte[] result = example.showBug(new byte[]{1, 2, 3, 4, 5}); // TRIGGER BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)

        // Since the buffer is modified, the first element should be 99
        assertEquals(99, result[0]); // This assertion will pass

        // Expecting the rest of the array to remain the same
        assertArrayEquals(new byte[]{99, 2, 3, 4, 5}, result); // This assertion will fail, demonstrating the bug
    }
}