import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;  // Essential import for Map

public class SpringModelBugDemoTest {

    @Test
    public void testShowBug() {
        SpringModelBugDemo demo = new SpringModelBugDemo();
        Map<String, Object> model = demo.showBug();

        // Expecting null because the key is improperly named and may cause issues in some contexts
        assertNull(model.get("InvalidKey")); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
    }
}