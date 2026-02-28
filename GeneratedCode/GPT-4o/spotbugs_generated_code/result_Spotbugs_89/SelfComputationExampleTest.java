import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComputationExampleTest {

    @Test
    public void testShowBug() {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug();
        assertNotEquals(0, result); // TRIGGER BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
    }
}