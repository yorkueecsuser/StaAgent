import org.junit.Test;
import static org.junit.Assert.*;

public class IsInstanceIncompatibleTypeBugTest {
    @Test
    public void testShowBug() {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        // TRIGGER BUG: IsInstanceIncompatibleType
        assertFalse(bug.showBug(new Object()));
    }
}