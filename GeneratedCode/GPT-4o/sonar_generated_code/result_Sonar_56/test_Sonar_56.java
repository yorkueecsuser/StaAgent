import org.junit.Test;
import static org.junit.Assert.*;

public class StringAndBoxedComparisonTest {

    @Test
    public void testShowBug() {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Test case where strings have the same content but are different objects
        String result = example.showBug(new String("John"), new String("John")); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
        assertEquals("Strings are the same object", result); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithSameReference() {
        StringAndBoxedComparison example = new StringAndBoxedComparison();
        // Test case where strings are the same object
        String john = "John";
        String result = example.showBug(john, john); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
        assertEquals("Strings are the same object", result); // This should pass as both references point to the same object
    }
}