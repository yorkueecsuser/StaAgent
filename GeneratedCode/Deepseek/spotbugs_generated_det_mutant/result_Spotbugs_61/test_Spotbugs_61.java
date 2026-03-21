import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceBugTest {

    @Test
    // TRIGGER BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)
    public void testShowBug() {
        String str = null;
        NullDereferenceBug.showBug(str);
    }
}