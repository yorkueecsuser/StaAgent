import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidSynchronizedAtMethodLevelTest {
    AvoidSynchronizedAtMethodLevel avoidSynchronizedAtMethodLevel = new AvoidSynchronizedAtMethodLevel();

    @Test
    public void testShowBug() {
        String result = avoidSynchronizedAtMethodLevel.showBug();
        // TRIGGER BUG: AvoidSynchronizedAtMethodLevel
        assertNotEquals("bar", result); // Expected 'bar' but got 'barbar'
    }
}