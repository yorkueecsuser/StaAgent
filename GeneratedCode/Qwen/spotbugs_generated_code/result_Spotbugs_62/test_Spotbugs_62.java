import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterExampleTest {

    @Test
    public void testShowBugWithNull() {
        NullParameterExample example = new NullParameterExample();
        example.showBug(null); // TRIGGER BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }
}