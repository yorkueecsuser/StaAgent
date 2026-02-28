import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEJBTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: StaticEJBFieldShouldBeFinal
        BuggyEJB buggyEJB = new BuggyEJB();
        buggyEJB.showBug();
        int before = buggyEJB.getCounter();
        buggyEJB.doSomething();
        int after = buggyEJB.getCounter();
        assertNotEquals(before, after); // TRIGGER BUG: StaticEJBFieldShouldBeFinal
    }
}