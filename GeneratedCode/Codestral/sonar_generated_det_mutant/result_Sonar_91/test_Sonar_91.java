import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugTest {
    @Test
    public void showBugTest() {
        OptionalBug buggyClass = new OptionalBug();
        assertNull(buggyClass.showBug()); // TRIGGER BUG: "null" should not be used with "Optional"
    }
}