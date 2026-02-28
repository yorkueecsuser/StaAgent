import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionSideEffectExampleTest {

    @Test
    public void testShowBug() {
        AssertionSideEffectExample example = new AssertionSideEffectExample();
        assertEquals(5, example.showBug()); // TRIGGER BUG: ASE: Method invoked in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT_METHOD) 
    }
}