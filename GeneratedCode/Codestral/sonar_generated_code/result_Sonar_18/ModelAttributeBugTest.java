import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;

public class ModelAttributeBugTest {

    @Test
    public void testBugTriggering() {
        ModelAttributeBug buggyClass = new ModelAttributeBug();
        Map<String, Object> model = buggyClass.showBug();
        Object invalidAttribute = model.get("invalid_attribute_name"); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
        assertNotNull(invalidAttribute);
    }
}