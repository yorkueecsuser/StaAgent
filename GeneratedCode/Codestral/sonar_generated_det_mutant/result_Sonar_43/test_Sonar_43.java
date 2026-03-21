import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionBugTest {

    @Test
    public void testShowBug() {
        RegularExpressionBug bug = new RegularExpressionBug();
        assertNotNull(bug.showBug("Something ([")); // TRIGGER BUG: Regular expressions should be syntactically valid
    }
}