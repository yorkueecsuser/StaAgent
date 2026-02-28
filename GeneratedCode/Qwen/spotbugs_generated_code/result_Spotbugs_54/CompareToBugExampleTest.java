import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugExampleTest {

    @Test
    public void testShowBugWithSpecificValues() {
        CompareToBugExample example = new CompareToBugExample();
        assertEquals(-1, example.showBug("apple", "banana")); // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        assertEquals(1, example.showBug("banana", "apple")); // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        assertEquals(0, example.showBug("apple", "apple"));  // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
    }
}