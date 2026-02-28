import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalBugTest {
    @Test
    public void testShowBug() {
        OptionalBug bug = new OptionalBug();
        bug.showBug();  // TRIGGER BUG: "null" should not be used with "Optional"
    }
}