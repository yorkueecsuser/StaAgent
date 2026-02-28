import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExceptionBugTest {
    @Test
    public void testGetNullStringLength() {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug(); // TRIGGER BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }
}