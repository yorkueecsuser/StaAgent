import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

    @Test
    public void testShowBug() {
        BugDemonstration bugDemonstration = new BugDemonstration();
        bugDemonstration.showBug(); // TRIGGER BUG: ForOverride by directly invoking the overriddenMethod from outside the class
    }
}