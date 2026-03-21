import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunBugExampleTest {

    @Test
    public void testShowBug() {
        ThreadRunBugExample example = new ThreadRunBugExample();
        String result = example.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
        assertEquals("Running in a new thread!", result);
    }
}