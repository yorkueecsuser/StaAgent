import org.junit.Test;
import static org.junit.Assert.*;

public class MutualRecursionTest {

    @Test
    public void testMutualRecursionCycle() {
        MutualRecursion example = new MutualRecursion();
        assertEquals(0, example.showBug(0)); // This should pass and not trigger the bug
        assertEquals(15, example.showBug(5)); // TRIGGER BUG: MUTUAL_RECURSION_CYCLE​
    }
}