import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AssertionSideEffectTest {

    @Test
    public void testShowBug() {
        AssertionSideEffect example = new AssertionSideEffect();
        List<String> result = example.showBug();  // TRIGGER BUG: Expressions used in "assert" should not produce side effects
        assertEquals(2, result.size());
    }
}