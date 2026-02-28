import org.junit.Test;
import static org.junit.Assert.*;

public class UnsupportedMethodBugTest {
    @Test
    public void testShowBug() {
        UnsupportedMethodBug bug = new UnsupportedMethodBug();
        // TRIGGER BUG: Unsupported methods should not be called on some collection implementations
        bug.showBug();
    }
}