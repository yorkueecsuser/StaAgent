import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterDemoTest {

    @Test
    public void testShowBug() {
        ConverterDemo demo = new SpecialConverter();
        String result = demo.showBug("hello"); // TRIGGER BUG: ForOverride
        assertEquals("hello Special", result); // Expect the overridden behavior
    }
}