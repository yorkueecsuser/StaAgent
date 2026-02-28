import org.junit.Test;
import static org.junit.Assert.*;

public class NonsensicalSelfComputationTest {
    @Test
    public void testShowBug() {
        int x = 5;
        int y = x & x; // TRIGGER BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        assertEquals(0, y); // Expecting 0, but will get 5 due to the bug
    }
}