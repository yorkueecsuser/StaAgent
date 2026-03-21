import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        assertFalse(bugExample.showBug(10));  // TRIGGER BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    }
}