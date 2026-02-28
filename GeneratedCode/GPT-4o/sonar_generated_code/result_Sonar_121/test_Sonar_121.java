import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBug_TriggerCompareToBug() {
        CompareToBugExample example = new CompareToBugExample();
        
        // This line triggers the bug because it assumes compareTo only returns -1, 0, or 1
        int result = example.showBug("apple", "banana"); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(-1, result);

        // This line triggers the bug because it assumes compareTo only returns -1, 0, or 1
        result = example.showBug("banana", "apple"); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(1, result);

        // This line triggers the bug because it assumes compareTo only returns -1, 0, or 1
        result = example.showBug("orange", "orange"); // TRIGGER BUG: "compareTo" results should not be checked for specific values
        assertEquals(0, result);
    }
}