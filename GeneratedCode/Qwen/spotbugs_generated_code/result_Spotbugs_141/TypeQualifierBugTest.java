import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBugWithNull() {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        assertNotNull(bugDemo.showBug(null)); // TRIGGER BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED) 
    }

    @Test
    public void testShowBugWithEmptyString() {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        assertTrue(!bugDemo.showBug("").isEmpty()); // TRIGGER BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED) 
    }
}