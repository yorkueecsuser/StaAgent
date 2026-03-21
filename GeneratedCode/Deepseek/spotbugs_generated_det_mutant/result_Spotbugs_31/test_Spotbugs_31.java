import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        // Instantiate BugExample
        BugExample bugExample = new BugExample();

        // Call the showBug method
        bugExample.showBug();

        // TRIGGER BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    }
}