import org.junit.Test;
import static org.junit.Assert.*;

public class SpELSyntaxExampleTest {

    @Test
    public void testShowBugWithInvalidSpELSyntax() {
        SpELSyntaxExample example = new SpELSyntaxExample();
        
        // The following line will trigger the bug because the SpEL expression in showBug is invalid
        String result = example.showBug("validKey"); // TRIGGER BUG: SpEL expression should have a valid syntax

        // This assertion is expected to fail due to the invalid SpEL syntax
        assertEquals("SomeValue", result);
    }
}