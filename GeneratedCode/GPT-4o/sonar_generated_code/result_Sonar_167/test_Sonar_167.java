import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadRunBugExampleTest {

    @Test
    public void testShowBug() {
        ThreadRunBugExample example = new ThreadRunBugExample();
        example.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
    }
}