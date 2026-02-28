import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample.showBug(); // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}