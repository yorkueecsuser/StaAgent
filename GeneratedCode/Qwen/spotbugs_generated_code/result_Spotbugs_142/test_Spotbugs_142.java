import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBugWithIncompatibleQualifiers() {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        assertFalse(bugDemo.showBug(-1, 1)); // TRIGGER BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS) ⁠
    }
}