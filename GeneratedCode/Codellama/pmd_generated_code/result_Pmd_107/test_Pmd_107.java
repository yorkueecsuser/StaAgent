import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveLiteralAppendsTest {
    @Test
    public void testConsecutiveLiteralAppends() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        assertEquals("Hello, World!", sb.toString());
    }
}