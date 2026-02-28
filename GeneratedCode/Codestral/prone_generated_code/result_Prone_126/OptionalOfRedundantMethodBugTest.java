import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalOfRedundantMethodBugTest {
    @Test
    public void testShowBug() {
        OptionalOfRedundantMethodBug bug = new OptionalOfRedundantMethodBug();
        assertEquals("Test", bug.showBug("Test")); // TRIGGER BUG: OptionalOfRedundantMethod - The bug is triggered here as isPresent() is unnecessary with Optional.of()
        assertNotEquals("Default Value", bug.showBug("Test")); // This test will fail as isPresent() is unnecessary with Optional.of()
    }
}