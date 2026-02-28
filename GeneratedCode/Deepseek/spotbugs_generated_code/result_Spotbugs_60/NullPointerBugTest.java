import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugTest {
    @Test
    public void testShowBugWithNullData() {
        NullPointerBug bug = new NullPointerBug();
        bug.setData(null);
        bug.showBug(); // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }
}