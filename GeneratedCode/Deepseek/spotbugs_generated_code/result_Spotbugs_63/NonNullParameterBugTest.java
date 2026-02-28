import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullParameterBugTest {

    @Test
    public void testShowBug() {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug(); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    }
}