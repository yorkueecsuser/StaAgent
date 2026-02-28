import org.junit.Test;
import static org.junit.Assert.*;

public class NonsensicalSelfComputationBugTest {

    @Test
    public void testShowBug() {
        // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        assertNotEquals(5, result); // This assertion will fail, triggering the bug
    }
}