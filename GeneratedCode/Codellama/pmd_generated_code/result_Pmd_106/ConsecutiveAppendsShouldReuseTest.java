import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveAppendsShouldReuseTest {

    @Test
    public void testConsecutiveAppends() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());

        assertEquals("Hello World!", sb.toString());
    }

    @Test
    public void testConsecutiveAppendsWithBug() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        // TRIGGER BUG: ConsecutiveAppendsShouldReuse
        assertEquals("Hello World!", sb.toString());
    }
}