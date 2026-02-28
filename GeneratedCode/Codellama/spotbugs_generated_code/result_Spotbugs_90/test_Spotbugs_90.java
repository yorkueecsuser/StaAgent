import org.junit.Test;
import static org.junit.Assert.*;

class SelfComputationTest {
    @Test
    // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
    public void testBug() {
        SelfComputation selfComputation = new SelfComputation();
        int x = 5;
        int y = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        assertEquals(y, 5);
    }
}