import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testExample() {
        TypeQualifierBug tqb = new TypeQualifierBug();
        // TRIGGER BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        assertFalse(tqb.showBug());
    }
}