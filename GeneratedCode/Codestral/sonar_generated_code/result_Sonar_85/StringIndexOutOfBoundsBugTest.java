import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {

    StringIndexOutOfBoundsBug buggyClass = new StringIndexOutOfBoundsBug();

    @Test
    public void testShowBugSubstringWithNegativeIndex() {
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        buggyClass.showBugSubstring("Hello", -1);
    }

    @Test
    public void testShowBugSubstringWithLargeIndex() {
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        buggyClass.showBugSubstring("Hello", 6);
    }

    @Test
    public void testShowBugCharAtWithNegativeIndex() {
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        buggyClass.showBugCharAt("Hello", -1);
    }

    @Test
    public void testShowBugCharAtWithLargeIndex() {
        // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
        buggyClass.showBugCharAt("Hello", 5);
    }
}