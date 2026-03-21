import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceBugTest {

    @Test
    public void testShowBug_nullString() {
        NullDereferenceBug bug = new NullDereferenceBug();
        // Triggering bug: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        bug.showBug();
    }
}