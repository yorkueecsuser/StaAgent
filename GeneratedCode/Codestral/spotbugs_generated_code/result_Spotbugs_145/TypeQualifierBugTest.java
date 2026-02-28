import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {
    @Test
    public void testShowBugWithNonStringObject() {
        Object obj = new Integer(10); // This object is not a String
        TypeQualifierBug.showBug(obj); // TRIGGER BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
    }
}