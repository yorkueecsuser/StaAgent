import org.junit.Test;
import static org.junit.Assert.*;

public class SpELBugDemoTest {

    @Test
    public void testShowBugWithInvalidExpression() {
        SpELBugDemo demo = new SpELBugDemo();
        String invalidExpression = "#{1 / 0"; // Intentionally incorrect SpEL expression
        Object result = demo.showBug(invalidExpression); // TRIGGER BUG: SpEL expression should have a valid syntax
        assertNotNull(result); // This line will not be reached if an exception is thrown
    }
}