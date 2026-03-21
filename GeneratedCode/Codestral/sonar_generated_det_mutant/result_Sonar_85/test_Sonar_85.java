import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationBugTest {

    @Test
    public void testShowBugCharAt() {
        StringOperationBug bugObj = new StringOperationBug();
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        bugObj.showBugCharAt("Hello", 5);
    }

    @Test
    public void testShowBugSubstring1() {
        StringOperationBug bugObj = new StringOperationBug();
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        bugObj.showBugSubstring("Hello", 0, 6);
    }

    @Test
    public void testShowBugSubstring2() {
        StringOperationBug bugObj = new StringOperationBug();
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        bugObj.showBugSubstring("Hello", 2, 1);
    }
}