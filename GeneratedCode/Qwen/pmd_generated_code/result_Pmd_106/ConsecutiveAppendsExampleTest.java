import org.junit.Test;
import static org.junit.Assert.*;

public class ConsecutiveAppendsExampleTest {

    @Test
    public void testShowBug() {
        ConsecutiveAppendsExample example = new ConsecutiveAppendsExample();
        String result = example.showBug(); // TRIGGER BUG: ConsecutiveAppendsShouldReuse
        assertEquals("Hello World", result); // This assertion will pass, but the bug is triggered by the method call
    }
}