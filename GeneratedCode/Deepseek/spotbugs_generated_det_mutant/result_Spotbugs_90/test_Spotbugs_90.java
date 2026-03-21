import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        int result = bugExample.showBug();
        // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        assertEquals("The result should be the same as the input", 5, result);
    }
}