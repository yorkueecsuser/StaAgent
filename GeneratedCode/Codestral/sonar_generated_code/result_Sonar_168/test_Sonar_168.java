import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyHashCodeTest {

    @Test
    public void testShowBug() {
        BuggyHashCode a = new BuggyHashCode("Test");
        BuggyHashCode b = new BuggyHashCode("Test");
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode()); // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    }
}