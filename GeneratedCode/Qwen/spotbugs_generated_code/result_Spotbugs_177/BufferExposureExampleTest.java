import org.junit.Test;
import static org.junit.Assert.*;

public class BufferExposureExampleTest {

    @Test
    public void testBufferExposure() {
        BufferExposureExample example = new BufferExposureExample(new int[]{1, 2, 3, 4, 5});
        example.showBug(new int[]{10, 20, 30, 40, 50}); // TRIGGER BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
    }
}