import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugTest {
    @Test
    public void testShowBug() {
        NullPointerBug bug = new NullPointerBug();
        bug.showBug(); // TRIGGER BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }
}