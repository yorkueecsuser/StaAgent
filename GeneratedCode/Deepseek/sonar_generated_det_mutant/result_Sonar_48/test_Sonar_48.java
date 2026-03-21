import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class AssertJBugTest {

    @Test
    public void testShowBug() {
        AssertJBug bug = new AssertJBug();

        List<String> logs = bug.showBug();

        assertFalse(logs.isEmpty()); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertTrue(logs.containsAll(Arrays.asList("error1", "error2"))); // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
}