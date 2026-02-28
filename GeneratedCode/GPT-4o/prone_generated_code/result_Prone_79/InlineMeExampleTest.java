import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List; // Importing List for usage

public class InlineMeExampleTest {

    @Test
    public void testShowBugTriggersInlineMeValidator() {
        InlineMeExample example = new InlineMeExample();
        List<String> result = example.showBug(5); // TRIGGER BUG: InlineMeValidator
        assertNotNull(result); // This assertion is to ensure the method returns a non-null list
        assertEquals(5, result.size()); // This assertion checks the expected size of the list
    }

    @Test
    public void testShowBugIncorrectUsage() {
        InlineMeExample example = new InlineMeExample();
        List<String> result = example.showBug(3); // TRIGGER BUG: InlineMeValidator
        assertEquals("Element 0", result.get(0)); // Checking if the first element matches expectation
        assertEquals("Element 2", result.get(2)); // Checking if the last element matches expectation
    }
}