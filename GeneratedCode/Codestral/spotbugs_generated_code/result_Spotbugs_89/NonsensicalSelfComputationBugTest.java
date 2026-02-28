import org.junit.Test;
import static org.junit.Assert.*;

public class NonsensicalSelfComputationBugTest {

    @Test
    public void testShowBug() {
        NonsensicalSelfComputationBug buggyObj = new NonsensicalSelfComputationBug(5);
        int result = buggyObj.showBug();
        // TRIGGER BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        assertEquals("The bug is triggered as the result of bitwise AND operation on the same field always returns the same value", 5, result);
    }
}