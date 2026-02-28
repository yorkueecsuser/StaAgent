import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main m = new Main();

    @Test
    public void testShowBug() {
        int[] expectedArray = {0, 1, 2, 7}; // This is the expected result after mutation
        int[] actualArray = m.showBug(); // Call the method that triggers the bug
        assertArrayEquals(expectedArray, actualArray); // This test case should fail
        // TRIGGER BUG: MODIFIES_IMMUTABLE
    }
}