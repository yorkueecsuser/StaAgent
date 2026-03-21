import org.junit.Test;
import static org.junit.Assert.*;

public class NonExistentOperatorsBugTest {
    @Test
    public void showBugTest() {
        NonExistentOperatorsBug bug = new NonExistentOperatorsBug();
        int result = bug.showBug();
        assertNotEquals(-8, result); // TRIGGER BUG: Non-existent operators like "=+" should not be used
    }
}