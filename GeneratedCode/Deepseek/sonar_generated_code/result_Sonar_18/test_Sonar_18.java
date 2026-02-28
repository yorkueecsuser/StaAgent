import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        ModelMap model = new ModelMap();

        bugExample.showBug(model);  // TRIGGER BUG: Model attributes should follow the Java identifier naming convention

        assertTrue(model.containsAttribute("1invalid"));
    }
}