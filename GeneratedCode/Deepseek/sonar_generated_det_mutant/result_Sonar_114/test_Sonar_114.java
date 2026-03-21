import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBugTriggersBug() throws Exception {
        BugExample example = new BugExample();
        example.showBug(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
    }
}