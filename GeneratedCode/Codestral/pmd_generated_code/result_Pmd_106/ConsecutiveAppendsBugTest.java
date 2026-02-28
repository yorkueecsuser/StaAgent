import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveAppendsBugTest {
    @Test
    public void testShowBug() {
        ConsecutiveAppendsBug bug = new ConsecutiveAppendsBug();
        String result = bug.showBug();
        // TRIGGER BUG: ConsecutiveAppendsShouldReuse
        assertEquals("Hello World", result);
    }
}