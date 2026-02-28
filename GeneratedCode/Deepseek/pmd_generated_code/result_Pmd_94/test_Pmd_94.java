import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    private BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testBug() {
        Object o1 = buggyCode.showBug();
        Object o2 = buggyCode.showBug();

        assertSame(o1, o2); // TRIGGER BUG: DoubleCheckedLocking
    }
}