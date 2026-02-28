import org.junit.Test;
import static org.junit.Assert.*;

public class CaseConversionExampleTest {

    @Test
    public void testShowBugWithUpperCaseInput() {
        CaseConversionExample example = new CaseConversionExample();
        // TRIGGER BUG: UseLocaleWithCaseConversions
        assertFalse(example.showBug("LIST")); // This should return false, but may return true in Turkish locale
    }

    @Test
    public void testShowBugWithMixedCaseInput() {
        CaseConversionExample example = new CaseConversionExample();
        // TRIGGER BUG: UseLocaleWithCaseConversions
        assertFalse(example.showBug("LiSt")); // This should return false, but may return true in Turkish locale
    }

    @Test
    public void testShowBugWithLowerCaseInput() {
        CaseConversionExample example = new CaseConversionExample();
        // TRIGGER BUG: UseLocaleWithCaseConversions
        assertTrue(example.showBug("list")); // This should return true, but is included to check behavior consistency
    }
}