import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullViolationExampleTest {
    @Test
    public void showBugTest() {
        NonNullViolationExample example = new NonNullViolationExample();
        example.showBug(); // TRIGGER BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }
}