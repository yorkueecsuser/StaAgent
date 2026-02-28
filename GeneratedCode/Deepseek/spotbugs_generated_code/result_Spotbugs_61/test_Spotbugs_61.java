import org.junit.Test;
import static org.junit.Assert.*;

public class NullParameterBugTest {
    @Test
    public void testShowBug() {
        NullParameterBug.showBug(); // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    }
}