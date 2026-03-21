import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test(expected = NullPointerException.class)
    public void testShowBugNull() {
        BugExample bugExample = new BugExample();
        bugExample.showBugNull(); // TRIGGER BUG: NullArgumentForNonNullParameter
    }
}