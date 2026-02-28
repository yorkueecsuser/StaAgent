import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEJBTest {

    @Test
    public void testStaticEJBFieldShouldBeFinal() {
        BuggyEJB ejb1 = new BuggyEJB();
        BuggyEJB ejb2 = new BuggyEJB();

        ejb1.incrementCount();
        // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        // The count should be 1 for ejb1 but it will be 2 because the CountA field is not final
        assertEquals(1, ejb1.showBug());

        ejb2.incrementCount();
        // The count for ejb2 should be 2 but it will be 3 because CountA is shared between instances
        assertEquals(2, ejb2.showBug());
    }
}