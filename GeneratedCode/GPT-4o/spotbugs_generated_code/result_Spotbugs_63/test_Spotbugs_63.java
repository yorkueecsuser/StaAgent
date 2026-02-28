import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterBugDemoTest {

    @Test
    public void testShowBugWithNull() {
        NullParameterBugDemo demo = new NullParameterBugDemo();
        demo.showBug(null); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }
}