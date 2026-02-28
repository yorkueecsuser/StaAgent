import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityHashMapBoxingExampleTest {

    @Test
    public void testShowBug1() {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        assertNull(example.showBug1(128)); // TRIGGER BUG: IdentityHashMapBoxing
    }

    @Test
    public void testShowBug2() {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        assertNotNull(example.showBug2(128)); // This should not trigger the bug
    }
}