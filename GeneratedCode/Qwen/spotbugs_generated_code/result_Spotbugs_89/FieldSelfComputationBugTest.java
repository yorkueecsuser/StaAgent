import org.junit.Test;
import static org.junit.Assert.*;

public class FieldSelfComputationBugTest {

    @Test
    public void testShowBug() {
        FieldSelfComputationBug bugDemo = new FieldSelfComputationBug(5);
        int result = bugDemo.showBug(); // TRIGGER BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION) 
        assertEquals(5, result); // This assertion will fail because the computation is nonsensical and always returns the original value, which might not be the intended logic.
    }
}