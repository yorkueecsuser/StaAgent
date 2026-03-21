import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugExampleTest {

    @Test
    public void testShowBug() {
        AssertJBugExample example = new AssertJBugExample();
        // Triggering the bug by calling showBug which internally calls showBug1 and showBug2
        example.showBug(); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}