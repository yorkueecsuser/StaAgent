import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionWithSideEffectTest {
    @Test
    public void testAssertionWithSideEffect() {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // TRIGGER BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }
}