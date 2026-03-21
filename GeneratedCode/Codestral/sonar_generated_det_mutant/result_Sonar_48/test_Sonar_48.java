import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class BuggyAssertJAssertionsTest {
    @Test
    public void showBugTest() {
        BuggyAssertJAssertions buggyAssertions = new BuggyAssertJAssertions();
        List<String> logs = new ArrayList<>();
        // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertFalse(buggyAssertions.showBug(logs));
    }
}