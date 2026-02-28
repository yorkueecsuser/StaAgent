import org.junit.Test;
import static org.junit.Assert.*;

public class DuplicateBranchesBugTest {
    @Test
    public void testShowBug() {
        DuplicateBranchesBug bug = new DuplicateBranchesBug();

        // TRIGGER BUG: DuplicateBranches
        assertEquals("Both branches contain identical code", 10, bug.showBug(5));
        assertEquals("Both branches contain identical code", -10, bug.showBug(-5));
    }
}