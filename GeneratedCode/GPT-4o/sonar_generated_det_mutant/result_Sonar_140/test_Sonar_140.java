import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstrationTest {

    @Test
    public void testShowBug() {
        BugDemonstration demo = new BugDemonstration();
        int result = demo.showBug(); // TRIGGER BUG: Values should not be uselessly incremented
        assertEquals(1, result); // This assertion will fail because of the bug
    }
}