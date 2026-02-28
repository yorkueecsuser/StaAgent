import org.junit.Test;
import static org.junit.Assert.*;

public class MapBugTest {
    @Test
    public void testShowBug() {
        MapBug bugObject = new MapBug();
        String initialValue = "Apple";
        String updatedValue = "Boy";

        assertEquals(initialValue, bugObject.showBug()); // Initial test case should pass
        bugObject.showBug(); // Trigger the bug here
        assertNotEquals(initialValue, bugObject.showBug()); // This test case should fail because the value has been unconditionally replaced
    }
}