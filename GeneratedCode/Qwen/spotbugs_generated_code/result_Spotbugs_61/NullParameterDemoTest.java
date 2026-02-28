import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterDemoTest {

    @Test
    public void testShowBugWithNull() {
        NullParameterDemo demo = new NullParameterDemo();
        demo.showBug(null); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }
}