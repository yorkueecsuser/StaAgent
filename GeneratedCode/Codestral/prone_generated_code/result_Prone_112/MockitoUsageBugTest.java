import org.junit.Test;
import static org.junit.Assert.*;

public class MockitoUsageBugTest {

    @Test
    public void testShowBug() {
        MockitoUsageBug bug = new MockitoUsageBug();
        bug.setup();
        assertThrows(NullPointerException.class, () -> {
            bug.showBug(); // TRIGGER BUG: MockitoUsage
        });
    }
}