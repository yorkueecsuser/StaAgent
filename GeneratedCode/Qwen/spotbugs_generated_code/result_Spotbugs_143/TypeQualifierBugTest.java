import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBug() {
        TypeQualifierBug bug = new TypeQualifierBug();
        Integer result = bug.showBug(-1); // TRIGGER BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
        assertEquals(Integer.valueOf(-1), result);
    }
}