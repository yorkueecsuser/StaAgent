import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class DoubleBraceInitializationBugTest {
    @Test
    public void testShowBug() {
        DoubleBraceInitializationBug bugInstance = new DoubleBraceInitializationBug();
        Map<String, String> expected = new HashMap<>();
        expected.put("firstName", "John");
        expected.put("lastName", "Smith");

        Map<String, String> actual = bugInstance.showBug(); // TRIGGER BUG: Double Brace Initialization should not be used

        assertNotEquals(expected, actual);
    }
}