import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopBugTest {

    @Test
    public void testShowBug() {
        InfiniteLoopBug bug = new InfiniteLoopBug();
        bug.showBug(); // TRIGGER BUG: Loops should not be infinite
    }
}