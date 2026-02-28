import org.junit.Test;
import static org.junit.Assert.*;

public class HeavyBlockingOperationBugTest {

    @Test
    public void testBugTrigger() {
        HeavyBlockingOperationBug bug = new HeavyBlockingOperationBug();
        bug.main(null); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
    }
}