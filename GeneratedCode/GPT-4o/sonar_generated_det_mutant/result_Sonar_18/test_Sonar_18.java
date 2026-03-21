import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class SpringModelBugExampleTest {

    @Test
    public void testShowBug() {
        SpringModelBugExample example = new SpringModelBugExample();
        Map<String, Object> result = example.showBug(); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention

        // Assertions to detect the bug
        assertNotNull(result);
        assertTrue(result.containsKey("1invalidKey")); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
        assertTrue(result.containsKey("!invalidKey")); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
    }
}