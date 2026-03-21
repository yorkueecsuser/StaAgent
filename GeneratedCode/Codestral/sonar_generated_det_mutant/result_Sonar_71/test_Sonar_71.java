import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugTest {
    @Test
    public void testShowBug() {
        OptionalBug bug = new OptionalBug();
        // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
        String result = bug.showBug();
        fail("Expected NoSuchElementException was not thrown");
    }
}