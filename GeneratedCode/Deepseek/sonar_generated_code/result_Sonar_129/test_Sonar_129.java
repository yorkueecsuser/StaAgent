import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testCompareTo() {
        BugExample.InnerClass a = new BugExample.InnerClass(5);
        BugExample.InnerClass b = new BugExample.InnerClass(10);
        assertEquals(-1, a.compareTo(b)); // This test case should fail
        // TRIGGER BUG: "compareTo" should not return "Integer.MIN_VALUE"
    }
}