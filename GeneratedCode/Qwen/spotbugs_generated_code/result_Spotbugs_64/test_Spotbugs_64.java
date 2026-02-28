import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterExampleTest {

    @Test
    public void testShowBug() {
        NullParameterExample example = new NullParameterExample();
        example.showBug(); // TRIGGER BUG: NP: Method call passes null to a non-null parameter (NP_NONNULL_PARAM_VIOLATION)
    }
}