import org.junit.Test;
import static org.junit.Assert.*;
import org.assertj.core.api.Assertions;

public class AssertJBugExampleTest {

    @Test
    public void testShowBug() {
        AssertJBugExample bugExample = new AssertJBugExample();
        assertNotNull("The returned list should not be null", bugExample.showBug()); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }
}