import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalMapBugExampleTest {

    @Test
    public void testShowBugWithNonNullInput() {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug("Test String"); // TRIGGER BUG: OptionalMapUnusedValue
    }

    @Test
    public void testShowBugWithNullInput() {
        OptionalMapBugExample example = new OptionalMapBugExample();
        example.showBug(null); // TRIGGER BUG: OptionalMapUnusedValue
    }
}