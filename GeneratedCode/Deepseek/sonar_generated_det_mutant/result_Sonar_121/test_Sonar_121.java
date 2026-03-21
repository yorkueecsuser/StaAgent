import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyComparatorTest {
    @Test
    public void testShowBug() {
        BuggyComparator buggyComparator = new BuggyComparator();
        assertEquals("Bug should be triggered", -1, buggyComparator.showBug("apple", "banana")); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals("Bug should be triggered", 1, buggyComparator.showBug("banana", "apple")); // TRIGGER BUG: "compareTo" results should not be checked for specific values
    }
}