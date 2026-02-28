import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterBugTest {

    @Test
    public void testShowBugWithNull() {
        NullParameterBug bugDemo = new NullParameterBug();
        bugDemo.showBug(null); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }
}