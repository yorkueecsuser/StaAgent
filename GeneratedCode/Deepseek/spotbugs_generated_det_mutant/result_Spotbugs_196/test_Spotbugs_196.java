import org.junit.Test;
import static org.junit.Assert.*;

public class OverridableMethodCallBugTest {

    @Test
    // TRIGGER BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
    public void testShowBug() {
        OverridableMethodCallBug bug = new OverridableMethodCallBug();
        bug.showBug();
    }
}