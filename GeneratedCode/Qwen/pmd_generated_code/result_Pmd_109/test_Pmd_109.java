import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientStringBufferingExampleTest {

    @Test
    public void testShowBug() {
        InefficientStringBufferingExample example = new InefficientStringBufferingExample();
        String result = example.showBug(); // TRIGGER BUG: InefficientStringBuffering
        assertEquals("Expected result does not match", "tmp = " + System.getProperty("java.io.tmpdir"), result);
    }
}