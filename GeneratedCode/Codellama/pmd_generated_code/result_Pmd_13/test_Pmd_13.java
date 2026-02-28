import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidFieldNameMatchingTypeNameTest {
    @Test
    public void testBug() {
        AvoidFieldNameMatchingTypeName a = new AvoidFieldNameMatchingTypeName();
        a.showBug();
        assertEquals("Hello, World!", a.AvoidFieldNameMatchingTypeName);
    }
}

/* JSON output:
{
  "Trigger_Explanation": "The test case triggers the bug by calling the showBug method, which in turn sets the field AvoidFieldNameMatchingTypeName to a value different from the original value.",
  "Trigger_Line": [3, 6]
}
*/