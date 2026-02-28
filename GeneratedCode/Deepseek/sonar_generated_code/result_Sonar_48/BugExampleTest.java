import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        List<String> logs = BugExample.showBug(); 
        // TRIGGER BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
        assertEquals(1, logs.size());
        assertTrue(logs.get(0).contains("warning"));
    }
}