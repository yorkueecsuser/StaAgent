import org.junit.Test;
import static org.junit.Assert.*;

public class MissingWarningExampleTest {

    @Test
    public void testShowBugWithTrueCondition() {
        MissingWarningExample example = new MissingWarningExample();
        example.showBug(true); // TRIGGER BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }

    @Test
    public void testShowBugWithFalseCondition() {
        MissingWarningExample example = new MissingWarningExample();
        String result = example.showBug(false); 
        assertEquals("NOT NULL", result.toUpperCase());
    }
}