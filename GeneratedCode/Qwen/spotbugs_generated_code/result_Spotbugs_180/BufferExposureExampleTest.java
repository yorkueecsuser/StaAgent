import org.junit.Test;
import static org.junit.Assert.*;

public class BufferExposureExampleTest {

    @Test
    public void testBufferExposure() {
        byte[] initialData = {1, 2, 3};
        BufferExposureExample example = new BufferExposureExample(initialData);
        byte[] exposedBuffer = example.showBug();
        exposedBuffer[0] = 9; // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2) 
        assertEquals(1, example.showBug()[0]); // This assertion will fail because the internal buffer is modified
    }
}