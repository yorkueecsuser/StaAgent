import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringBugTest {
    @Test
    public void testStringToStringBug() {
        StringToStringBug bug = new StringToStringBug();
        String input = new String("howdy");  // Creating a new String object to trigger the bug
        String result = bug.showBug(input);
        assertNotSame(input, result);  // TRIGGER BUG: StringToString
    }
}