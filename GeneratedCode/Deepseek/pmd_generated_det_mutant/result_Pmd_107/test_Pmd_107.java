import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveLiteralAppendsTest {
    @Test
    public void testShowBug() {
        ConsecutiveLiteralAppends c = new ConsecutiveLiteralAppends();
        // TRIGGER BUG: ConsecutiveLiteralAppends
        assertEquals("Hello World", c.showBug());
    }
}