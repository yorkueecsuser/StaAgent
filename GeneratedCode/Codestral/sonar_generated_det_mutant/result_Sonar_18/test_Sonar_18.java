import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class ModelAttributeNamingBugTest {

    @Test
    public void testShowBug() {
        ModelAttributeNamingBug bug = new ModelAttributeNamingBug();
        Map<String, Object> model = new HashMap<>();
        String attributeName = "invalidAttributeName!"; // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
        bug.showBug(model, attributeName);
    }
}