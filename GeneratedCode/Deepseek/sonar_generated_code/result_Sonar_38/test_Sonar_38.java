import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: Assertions should not be used in production code
    public void testShowBug() {
        BugExample example = new BugExample();
        example.showBug(); // This line triggers the bug
    }

}