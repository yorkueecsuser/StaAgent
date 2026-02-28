import org.junit.Test;
import static org.junit.Assert.*;

public class NonVirtualMethodCallBugTest {

    @Test
    public void testShowBug() {
        NonVirtualMethodCallBug example = new NonVirtualMethodCallBug();
        example.showBug(); // TRIGGER BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }
}