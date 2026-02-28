import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugExampleTest {

    @Test
    public void testShowBug() {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        String result = example.showBug("This is a test"); // TRIGGER BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
        assertNotNull(result); // This will fail due to the bug in showBug method
    }
}