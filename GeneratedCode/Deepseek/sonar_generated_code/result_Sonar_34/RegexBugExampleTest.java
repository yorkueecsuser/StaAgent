import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBugExampleTest {
    // TRIGGER BUG: Regex boundaries should not be used in a way that can never be matched
    @Test
    public void testShowBug() {
        RegexBugExample rbe = new RegexBugExample();
        assertNull(rbe.showBug()); // The test case should fail here because the return value is not null
    }
}