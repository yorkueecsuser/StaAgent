import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testEqualsMethodTriggersBug() {
        BuggyClass buggyObj1 = new BuggyClass(5);
        BuggyClass buggyObj2 = new BuggyClass(5);

        // TRIGGER BUG: EqualsReference
        buggyObj1.showBug(buggyObj2);
    }
}