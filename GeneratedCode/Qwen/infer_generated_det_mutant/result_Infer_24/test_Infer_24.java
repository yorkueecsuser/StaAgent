import org.junit.Test;
import static org.junit.Assert.*;

public class InvariantCallExampleTest {

    @Test
    public void testInvariantHoist() {
        InvariantCallExample example = new InvariantCallExample();
        assertEquals(5, example.showBug(5)); // TRIGGER BUG: INVARIANT_CALL​
    }

    @Test
    public void testInvariantHoistWithZero() {
        InvariantCallExample example = new InvariantCallExample();
        assertEquals(0, example.showBug(0)); // TRIGGER BUG: INVARIANT_CALL​
    }

    @Test
    public void testInvariantHoistWithNegative() {
        InvariantCallExample example = new InvariantCallExample();
        assertEquals(-1, example.showBug(-1)); // TRIGGER BUG: INVARIANT_CALL​
    }
}