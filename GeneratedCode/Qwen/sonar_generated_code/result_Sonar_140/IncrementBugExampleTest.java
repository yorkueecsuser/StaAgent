import org.junit.Test;
import static org.junit.Assert.*;

public class IncrementBugExampleTest {

    @Test
    public void testPickNumber() {
        IncrementBugExample example = new IncrementBugExample();
        int result = example.showBug(); // TRIGGER BUG: Values should not be uselessly incremented
        assertEquals(1, result); // This assertion will fail because the method returns 0 due to the bug
    }
}