import org.junit.Test;
import static org.junit.Assert.*;

public class SpelExpressionBugTest {

    @Test
    public void testShowBugWithInvalidSpEL() {
        SpelExpressionBug bugDemo = new SpelExpressionBug();
        assertEquals("#{map['key']}", bugDemo.showBug("name")); // TRIGGER BUG: SpEL expression should have a valid syntax
    }
}