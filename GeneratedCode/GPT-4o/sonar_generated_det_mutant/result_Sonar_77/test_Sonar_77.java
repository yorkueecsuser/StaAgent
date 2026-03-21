import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ExpressionSideEffectInAssertTest {

    @Test
    public void testShowBug() {
        // Prepare the test data
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        myList.add("Element2");

        // Create an instance of the class to test
        ExpressionSideEffectInAssert instance = new ExpressionSideEffectInAssert();

        // Call the method and trigger the bug
        boolean result = instance.showBug(myList);  // TRIGGER BUG: Expressions used in "assert" should not produce side effects

        // Assert that the list should be empty but the bug prevents this
        assertFalse(result);  // This will fail when the bug is triggered
    }
}