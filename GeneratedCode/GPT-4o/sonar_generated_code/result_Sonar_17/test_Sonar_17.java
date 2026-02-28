import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncBugExampleTest {

    @Test
    public void testShowBug() {
        AsyncBugExample example = new AsyncBugExample();
        example.showBug(); // TRIGGER BUG: Async methods should return void or Future
        fail("The test is expected to fail due to the bug in performAsyncTask."); // TRIGGER BUG: Async methods should return void or Future
    }
}