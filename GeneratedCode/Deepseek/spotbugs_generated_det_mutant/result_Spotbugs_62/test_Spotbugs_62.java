import org.junit.Test;
import static org.junit.Assert.*;

public class NonVirtualMethodBugTest {
    @Test
    public void testShowBug() {
        NonVirtualMethodBug n = new NonVirtualMethodBug();
        n.showBug(null); // TRIGGER BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }
}