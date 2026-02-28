import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerExampleTest {

    @Test
    public void testShowBug() {
        FloggerExample example = new FloggerExample();
        String result = example.showBug(); // TRIGGER BUG: FloggerLogString
        assertEquals("This is a dynamic message", result);
    }
}