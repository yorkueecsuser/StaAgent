import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

public class BugDemonstrationTest {

    @Test
    public void testShowBugWithInvalidAttributeName() {
        Model model = new BindingAwareModelMap();
        BugDemonstration bugDemonstration = new BugDemonstration();
        bugDemonstration.showBug(model); // TRIGGER BUG: Model attributes should follow the Java identifier naming convention
        assertTrue(model.containsAttribute("1invalidName")); // This assertion will pass, but the bug is triggered by the invalid attribute name
    }
}