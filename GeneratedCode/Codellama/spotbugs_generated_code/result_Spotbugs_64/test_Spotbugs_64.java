import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void testBugTrigger() {
        Example example = new Example();
        example.showBug();
        // TRIGGER BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
        example.nullPassedToNonNullParameter();
    }
}