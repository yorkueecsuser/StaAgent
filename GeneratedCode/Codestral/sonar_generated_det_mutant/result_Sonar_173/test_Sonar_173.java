import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {

    @Test
    public void testShowBug() throws Throwable {
        FinalizeBug bug = new FinalizeBug("Sample Resource");
        bug.showBug(); // TRIGGER BUG: The "Object.finalize()" method should not be called. This line explicitly calls the finalize method, which is not recommended.
    }
}