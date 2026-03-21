import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testMethod() {
        BuggyClass buggyClass = new BuggyClass();
        // TRIGGER BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        int field = buggyClass.showBug();
        // This local variable 'field' hides the class field 'field'
        // and can cause unexpected behavior
        System.out.println(field);
    }
}

JSON output:
{
  "Trigger_Explanation": "The test case triggers the bug by calling the method'showBug' which defines a local variable with the same name as the class field 'field'. This local variable 'field' hides the class field 'field' and can cause unexpected behavior.",
  "Trigger_Line": [11]
}