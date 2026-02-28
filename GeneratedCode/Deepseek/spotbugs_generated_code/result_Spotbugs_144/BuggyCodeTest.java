import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.ClassCastException;

public class BuggyCodeTest {

    @Test(expected = ClassCastException.class)
    public void testShowBug() {
        Object result = BuggyCode.showBug(); // TRIGGER BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        String stringResult = (String) result;
    }
}