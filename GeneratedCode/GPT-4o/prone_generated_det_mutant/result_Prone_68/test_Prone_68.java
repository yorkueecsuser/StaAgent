import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityHashMapBoxingExampleTest {

    @Test
    public void testShowBug() {
        IdentityHashMapBoxingExample example = new IdentityHashMapBoxingExample();
        int testValue = 1000;
        String result = example.showBug(testValue); // TRIGGER BUG: IdentityHashMapBoxing
        assertNull("Expected null due to IdentityHashMapBoxing issue", result); // TRIGGER BUG: IdentityHashMapBoxing
    }
}