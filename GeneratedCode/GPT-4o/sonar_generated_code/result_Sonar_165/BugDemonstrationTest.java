import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BugDemonstrationTest {

    @Test
    public void testShowBug() {
        BugDemonstration bugDemo = new BugDemonstration();
        String result = bugDemo.showBug("initial", 5, List.of("one", "two", "three")); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
        assertEquals("initial", result); // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    }
}