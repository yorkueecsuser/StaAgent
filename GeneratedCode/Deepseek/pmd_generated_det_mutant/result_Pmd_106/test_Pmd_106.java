import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveAppendsShouldReuseBugTest {
    ConsecutiveAppendsShouldReuseBug obj = new ConsecutiveAppendsShouldReuseBug();

    @Test
    public void testShowBug() {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello");
        buf.append(" "); // BUG: ConsecutiveAppendsShouldReuse
        buf.append("World");

        assertEquals("Hello World", obj.showBug()); // TRIGGER BUG: ConsecutiveAppendsShouldReuse
    }
}