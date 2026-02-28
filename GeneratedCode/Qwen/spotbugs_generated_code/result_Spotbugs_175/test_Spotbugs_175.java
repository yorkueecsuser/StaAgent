import org.junit.Test;
import static org.junit.Assert.*;

public class BufferExposureExampleTest {

    @Test
    public void testShowBug() {
        BufferExposureExample example = new BufferExposureExample();
        example.showBug(); // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF) 
    }
}