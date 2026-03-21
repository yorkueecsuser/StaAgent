import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringBugExampleTest {

    @Test
    public void testShowBugWithInvalidFormat() {
        FormatStringBugExample example = new FormatStringBugExample();
        
        // This test should fail and trigger the bug
        example.showBug("The number is: %d%%", 50); // TRIGGER BUG: FloggerFormatString
    }
}