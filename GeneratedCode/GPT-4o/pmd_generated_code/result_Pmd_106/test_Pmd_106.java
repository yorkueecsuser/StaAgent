import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderExampleTest {

    @Test
    public void testShowBug() {
        StringBuilderExample example = new StringBuilderExample();
        String result = example.showBug(" ");
        assertEquals("Hello World", result + "!"); // TRIGGER BUG: ConsecutiveAppendsShouldReuse
    }
}