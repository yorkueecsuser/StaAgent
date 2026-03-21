import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugDemoTest {

    @Test
    public void testShowBug() {
        AsyncBugDemo demo = new AsyncBugDemo();
        String result = demo.showBug(); // TRIGGER BUG: Async methods should return void or Future
        assertEquals("Completed!", result); // This assertion will fail due to the nature of async method
    }
}