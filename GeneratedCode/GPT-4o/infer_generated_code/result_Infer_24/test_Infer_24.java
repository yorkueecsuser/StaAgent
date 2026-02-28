import org.junit.Test;
import static org.junit.Assert.*;

public class InvariantCallExampleTest {

    @Test
    public void testShowBug() {
        InvariantCallExample example = new InvariantCallExample();
        int result = example.showBug(10); // TRIGGER BUG: INVARIANT_CALL​
        assertEquals("The result should be incorrect due to the invariant call bug.", 0, result); // TRIGGER BUG: INVARIANT_CALL​
    }
}