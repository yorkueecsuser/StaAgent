import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugExampleTest {

    @Test
    public void testShowBugWithNegativeValue() {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        Integer result = example.showBug(-5); // TRIGGER BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
        assertNotNull("Result should not be null", result);
    }

    @Test
    public void testShowBugWithPositiveValue() {
        TypeQualifierBugExample example = new TypeQualifierBugExample();
        Integer result = example.showBug(5); // TRIGGER BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
        assertNotNull("Result should not be null", result);
    }
}