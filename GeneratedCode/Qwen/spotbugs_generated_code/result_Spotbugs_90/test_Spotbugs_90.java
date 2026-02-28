import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComputationBugTest {

    @Test
    public void testNonsensicalSelfComputation() {
        SelfComputationBug bugDemo = new SelfComputationBug();
        int result = bugDemo.showBug(5); // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        assertEquals(10, result); // This will fail because the expected result (10) is incorrect, triggering the bug
    }
}