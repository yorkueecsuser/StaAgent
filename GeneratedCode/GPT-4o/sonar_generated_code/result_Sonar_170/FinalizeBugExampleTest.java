import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugExampleTest {

    @Test
    public void testShowBug() {
        FinalizeBugExample example = new FinalizeBugExample();
        int result = example.showBug(10); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
        assertEquals(20, result); // Expecting 20 but verifying the bug
    }
}