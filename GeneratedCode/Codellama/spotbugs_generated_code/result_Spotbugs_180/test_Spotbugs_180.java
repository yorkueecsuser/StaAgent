import org.junit.Test;
import static org.junit.Assert.*;

public class BufferExposureTest {
    @Test
    public void testBugTrigger() {
        int[] buffer = {1, 2, 3, 4, 5};
        BufferExposure be = new BufferExposure(buffer);
        be.showBug();
        // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        assertEquals(buffer, be.buggyBuffer);
    }
}