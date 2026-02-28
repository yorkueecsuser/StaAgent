import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunBugTest {
    @Test
    public void testShowBug() {
        ThreadRunBug threadRunBug = new ThreadRunBug();
        String result = threadRunBug.showBug();
        // TRIGGER BUG: "Thread.run()" should not be called directly
        assertNotEquals("This is running in a new thread.", result);
    }
}