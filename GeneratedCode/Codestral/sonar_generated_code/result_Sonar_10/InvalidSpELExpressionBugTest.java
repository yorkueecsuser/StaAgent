import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidSpELExpressionBugTest {
    @Test
    public void testBugTrigger() {
        InvalidSpELExpressionBug bugDemo = new InvalidSpELExpressionBug();
        assertNotEquals("Error: ", bugDemo.showBug("Test")); // TRIGGER BUG: SpEL expression should have a valid syntax
    }
}