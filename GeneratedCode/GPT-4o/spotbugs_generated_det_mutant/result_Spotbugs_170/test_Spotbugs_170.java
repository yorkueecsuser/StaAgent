import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSideEffectTest {

    @Test
    public void testShowBugSideEffect() {
        AssertionSideEffect example = new AssertionSideEffect();
        assertFalse("Expected the showBug method to return false due to assertion side effect", example.showBug()); // TRIGGER BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
    }
}