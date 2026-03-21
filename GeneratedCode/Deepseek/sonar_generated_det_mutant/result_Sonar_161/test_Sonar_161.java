import org.junit.Test;
import static org.junit.Assert.*;

public class SingleIterationLoopBugTest { // TRIGGER BUG: Loops with at most one iteration should be refactored

    @Test
    public void testShowBug() {
        SingleIterationLoopBug.showBug(); // Line 10
    }
}