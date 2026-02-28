import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullDerefTest {

    @Test
    public void testMain() {
        NonNullDeref obj = null;
        obj.printName(); // TRIGGER BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    }
}