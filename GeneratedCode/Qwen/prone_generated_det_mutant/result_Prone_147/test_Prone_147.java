import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnValueIgnoredExampleTest {

    @Test
    public void testShowBug() {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        assertEquals("hello", example.showBug("  hello  ")); // TRIGGER BUG: ReturnValueIgnored
    }

    @Test
    public void testShowBug1() {
        ReturnValueIgnoredExample example = new ReturnValueIgnoredExample();
        example.showBug1(null); // TRIGGER BUG: ReturnValueIgnored
    }
}