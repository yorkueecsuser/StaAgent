import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugExampleTest {
    NullPointerBugExample example = new NullPointerBugExample(); // Instance of the class to be tested

    @Test // JUnit annotation to mark this method as a test case
    public void testShowBug() {
        example.showBug(); // Trigger the bug
        // TRIGGER BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }
}