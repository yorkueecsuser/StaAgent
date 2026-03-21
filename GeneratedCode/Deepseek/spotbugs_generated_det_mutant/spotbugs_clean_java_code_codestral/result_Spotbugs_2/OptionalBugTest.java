import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugTest {
    @Test
    public void testShowBug() {
        OptionalBug bug = new OptionalBug();
        assertNotNull("Expected an empty Optional, but got null", bug.showBug()); // TRIGGER BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
    }
}