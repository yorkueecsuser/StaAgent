import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateBranchesBugTest {
    DuplicateBranchesBug bug = new DuplicateBranchesBug();

    @Test // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    public void testShowBug() {
        assertTrue(bug.showBug(0, 1, 0));
    }
}