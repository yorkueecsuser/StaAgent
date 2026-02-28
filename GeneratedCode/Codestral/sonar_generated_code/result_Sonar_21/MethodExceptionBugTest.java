import org.junit.Test;
import static org.junit.Assert.*;

public class MethodExceptionBugTest {
    @Test
    public void testShowBug() {
        MethodExceptionBug buggyObject = new MethodExceptionBug();
        buggyObject.showBug(); // TRIGGER BUG: Calls to methods should not trigger an exception
    }
}