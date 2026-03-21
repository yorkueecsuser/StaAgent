import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionBugTest {

    @Test
    public void testShowBug() {
        AssertionBug.showBug();  // TRIGGER BUG: Assertions should not be used in production code
    }
}