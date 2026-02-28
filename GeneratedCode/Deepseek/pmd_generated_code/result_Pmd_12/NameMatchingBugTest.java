import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class NameMatchingBugTest {
    NameMatchingBug bug = new NameMatchingBug();

    @Test
    public void testBugTrigger() {
        List<String> actual = bug.showBug();
        assertNotEquals("This test should fail as the bug is not triggered", "", actual.get(0));
        // TRIGGER BUG: AvoidFieldNameMatchingMethodName
    }
}