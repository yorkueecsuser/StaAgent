import org.junit.Test;
import static org.junit.Assert.*;

public class InlineMeValidatorBugTest {
    @Test
    public void testExpensiveMethod() {
        // TRIGGER BUG: InlineMeValidator - This test should fail because the @InlineMe annotation is used incorrectly on the expensiveMethod() method.
        InlineMeValidatorBug.showBug(10);
        fail("The test should have failed due to the @InlineMe annotation used incorrectly.");
    }
}