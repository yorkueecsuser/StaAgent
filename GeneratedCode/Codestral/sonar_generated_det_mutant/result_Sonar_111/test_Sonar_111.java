import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionsBugTest {

    @Test
    public void testShowBug() {
        LoopConditionsBug.showBug();  // TRIGGER BUG: Loop conditions should be true at least once
        assertTrue(false);  // Test case should fail if the bug is not triggered
    }
}