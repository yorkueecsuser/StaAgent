import org.junit.Test;
import static org.junit.Assert.*;

public class RegularExpressionBugTest {

    @Test
    public void testBugTrigger() {
        String output = RegularExpressionBug.showBug("([Hello"); // TRIGGER BUG: Regular expressions should be syntactically valid
        assertFalse(output.equals("Unexpected output")); // This assertion will fail due to the PatternSyntaxException thrown by showBug()
    }
}