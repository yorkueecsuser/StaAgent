import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class DoubleBraceInitializationExampleTest {

    @Test
    public void testShowBug() {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        List<String> result = example.showBug(); // TRIGGER BUG: DoubleBraceInitialization
        assertEquals(3, result.size());
        assertTrue(result.contains("Denmark"));
        assertTrue(result.contains("Norway"));
        assertTrue(result.contains("Sweden"));
        // Intentionally failing the test to trigger the bug
        assertFalse(result.isEmpty());
    }
}