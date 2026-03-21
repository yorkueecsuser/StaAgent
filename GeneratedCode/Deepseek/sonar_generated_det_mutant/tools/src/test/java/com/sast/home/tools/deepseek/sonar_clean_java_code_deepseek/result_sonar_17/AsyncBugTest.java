import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugTest {
    AsyncBug asyncBug = new AsyncBug();

    @Test
    public void testShowBug() {
        assertTrue(asyncBug.showBug().isDone()); // TRIGGER BUG: Async methods should return void or Future
        assertFalse(asyncBug.showBug().isCancelled()); // TRIGGER BUG: Async methods should return void or Future
        assertFalse(asyncBug.showBug().cancel(true)); // TRIGGER BUG: Async methods should return void or Future
        try {
            assertNotNull(asyncBug.showBug().get()); // TRIGGER BUG: Async methods should return void or Future
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}