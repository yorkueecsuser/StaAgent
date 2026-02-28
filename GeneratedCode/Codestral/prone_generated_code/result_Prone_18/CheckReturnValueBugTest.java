import org.junit.Test;
import static org.junit.Assert.*;

public class CheckReturnValueBugTest {

    @Test
    public void testShowBug() {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        assertFalse(bug.showBug().add("Not Used")); // TRIGGER BUG: CheckReturnValue
    }
}