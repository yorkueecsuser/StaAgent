import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToSpecificValueBugTest {

    @Test
    public void testShowBugWithSpecificReturnValues() {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        
        // This test case is designed to trigger the bug by comparing strings of different lengths.
        // The bug occurs because the showBug method checks for specific return values (1 and -1).
        
        int result1 = instance.showBug("abc", "ab"); // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        int result2 = instance.showBug("a", "abc"); // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        
        // The above lines should trigger the bug because they incorrectly check for specific return values.

        // Assert statements to ensure the test fails to indicate the presence of the bug
        // These assertions expect specific return values which should not be checked in actual implementation
        assertEquals(1, result1);
        assertEquals(-1, result2);
    }
}