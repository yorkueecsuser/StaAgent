import org.junit.Test;
import static org.junit.Assert.*;

public class SelfComputationExampleTest {

    @Test
    public void testShowBug() {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug(5);
        assertNotEquals(5, result); // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
    }

    @Test
    public void testShowBug2() {
        SelfComputationExample example = new SelfComputationExample();
        int result = example.showBug2(5);
        assertNotEquals(0, result); // TRIGGER BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
    }
}