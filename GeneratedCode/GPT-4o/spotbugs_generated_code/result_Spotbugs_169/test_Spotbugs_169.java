import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSideEffectExampleTest {

    @Test
    public void testShowBug() {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        example.showBug(5);  // TRIGGER BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }
}