import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBug() {
        try {
            int result = TypeQualifierBug.showBug(10);
            fail("Expected TypeQualifierChecker.TypeQualifierCheckError");
        } catch (Exception e) {
            // TRIGGER BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)
            assertEquals("TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED)", e.getMessage());
        }
    }
}