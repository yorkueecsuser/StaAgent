import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBugWithStringsInOrder() {
        CompareToBugExample.CustomString cs1 = new CompareToBugExample.CustomString("apple");
        CompareToBugExample.CustomString cs2 = new CompareToBugExample.CustomString("banana");
        CompareToBugExample example = new CompareToBugExample();
        boolean result = example.showBug(cs1, cs2); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertFalse("The comparison should not specifically return -1 or 1", result);
    }

    @Test
    public void testShowBugWithStringsOutOfOrder() {
        CompareToBugExample.CustomString cs1 = new CompareToBugExample.CustomString("banana");
        CompareToBugExample.CustomString cs2 = new CompareToBugExample.CustomString("apple");
        CompareToBugExample example = new CompareToBugExample();
        boolean result = example.showBug(cs1, cs2); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertFalse("The comparison should not specifically return -1 or 1", result);
    }

    @Test
    public void testShowBugWithEqualStrings() {
        CompareToBugExample.CustomString cs1 = new CompareToBugExample.CustomString("apple");
        CompareToBugExample.CustomString cs2 = new CompareToBugExample.CustomString("apple");
        CompareToBugExample example = new CompareToBugExample();
        boolean result = example.showBug(cs1, cs2); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertFalse("The comparison should not specifically return -1 or 1", result);
    }
}