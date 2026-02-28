import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSideEffectTest {

    @Test
    public void testShowBugWithAssertionSideEffect() {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug(); // TRIGGER BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }
}