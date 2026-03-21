import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bug = new BugExample();
        bug.showBug();  // TRIGGER BUG: Related "if/else if" statements should not have the same condition
    }
}