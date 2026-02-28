import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullParameterBugTest {
    @Test
    public void testProcessStringWithNull() {
        NonNullParameterBug buggyClass = new NonNullParameterBug();
        // TRIGGER BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
        buggyClass.showBug();
    }
}