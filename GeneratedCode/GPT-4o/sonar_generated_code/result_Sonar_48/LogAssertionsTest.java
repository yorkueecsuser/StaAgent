import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class LogAssertionsTest {

    @Test
    public void testShowBugWithEmptyList() {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>(); // An empty list
        boolean result = logAssertions.showBug(logs); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertFalse("Expected false as the list is empty", result);
    }

    @Test
    public void testShowBugWithNonEmptyList() {
        LogAssertions logAssertions = new LogAssertions();
        List<String> logs = new ArrayList<>();
        logs.add("error found"); // Adding an item that contains "error"
        boolean result = logAssertions.showBug(logs); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertFalse("Expected false because the list contains an 'error' entry", result);
    }
}