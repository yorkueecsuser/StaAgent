import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveLiteralAppendsBugTest {

    @Test
    public void testConsecutiveLiteralAppendsBug() {
        ConsecutiveLiteralAppendsBug bugDemo = new ConsecutiveLiteralAppendsBug();
        assertEquals("Hello World", bugDemo.showBug());  // TRIGGER BUG: ConsecutiveLiteralAppends
    }
}