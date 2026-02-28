import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSideEffectTest {
    @Test
    // TRIGGER BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD)
    public void testShowBug() {
        AssertionSideEffect example = new AssertionSideEffect();
        example.showBug();
        assertEquals(0, example.getValue()); // This test will fail because value is not 0 after showBug
    }
}