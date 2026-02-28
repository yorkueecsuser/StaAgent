import org.junit.Test;
import static org.junit.Assert.*;

public class FormatStringAnnotationBugTest {
    @Test
    public void testBugTrigger() {
        String message = FormatStringAnnotationBug.myLogMessage("My log message: %d and %d", 3, "has a message");
        // TRIGGER BUG: FormatStringAnnotation
        assertEquals("My log message: 3 and has a message", message);
    }
}