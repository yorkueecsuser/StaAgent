import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunBugTest {

    ThreadRunBug bug = new ThreadRunBug();

    @Test
    public void testShowBug() {
        bug.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
    }
}