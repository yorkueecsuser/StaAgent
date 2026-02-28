import org.junit.Test;
import static org.junit.Assert.*;

public class TypeQualifierBugTest {

    @Test
    public void testShowBug() {
        TypeQualifierBug bugInstance = new TypeQualifierBug();
        bugInstance.showBug(); // TRIGGER BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    }
}