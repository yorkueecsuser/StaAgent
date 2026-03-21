import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerDereferenceBugTest {

    @Test
    public void testShowBugWithNullMessage() {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // TRIGGER BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        bug.showBug();
    }
}