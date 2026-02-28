import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveLiteralAppendsExampleTest {

    @Test
    public void testShowBug1() {
        ConsecutiveLiteralAppendsExample example = new ConsecutiveLiteralAppendsExample();
        assertEquals("Hello World", example.showBug1()); // TRIGGER BUG: ConsecutiveLiteralAppends
    }

    @Test
    public void testShowBug2() {
        ConsecutiveLiteralAppendsExample example = new ConsecutiveLiteralAppendsExample();
        assertEquals("hello", example.showBug2()); // TRIGGER BUG: ConsecutiveLiteralAppends
    }

    @Test
    public void testShowBug3() {
        ConsecutiveLiteralAppendsExample example = new ConsecutiveLiteralAppendsExample();
        assertEquals("1m", example.showBug3()); // TRIGGER BUG: ConsecutiveLiteralAppends
    }
}