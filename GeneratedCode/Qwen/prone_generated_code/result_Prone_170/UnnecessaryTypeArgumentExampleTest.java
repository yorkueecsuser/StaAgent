import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryTypeArgumentExampleTest {

    @Test
    public void testShowBug() {
        UnnecessaryTypeArgumentExample example = new UnnecessaryTypeArgumentExample();
        String result = example.showBug("Hello, World!"); // TRIGGER BUG: UnnecessaryTypeArgument
        assertEquals("Hello, World!", result);
    }
}