import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BugDemonstrationTest {

    @Test(expected = AssertionError.class)
    public void testShowBug() {
        BugDemonstration bugDemo = new BugDemonstration();
        // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertFalse(bugDemo.showBug()); // This will fail if logs are empty because allMatch will return true
    }
}