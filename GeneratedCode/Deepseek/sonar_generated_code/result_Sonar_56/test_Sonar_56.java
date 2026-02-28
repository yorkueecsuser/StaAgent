import org.junit.Test;
import static org.junit.Assert.*;

public class StringEqualsBugTest {
    @Test
    public void testShowBugTriggerEqualsBug() {
        // StringEqualsBug bug = new StringEqualsBug();

        // assertEquals("Names are equal", bug.showBug()); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }
}