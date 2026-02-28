import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterViolationExampleTest {

    @Test
    public void testShowBug() {
        NullParameterViolationExample example = new NullParameterViolationExample();
        example.showBug(); // TRIGGER BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }
}