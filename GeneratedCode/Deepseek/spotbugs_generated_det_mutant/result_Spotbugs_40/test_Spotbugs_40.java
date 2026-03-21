import org.junit.Test;
import static org.junit.Assert.*;

public class BugClassTest {

    @Test
    public void testShowBug() {
        BugClass bugClass = new BugClass();
        assertNotEquals(null, bugClass.showBug()); // TRIGGER BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    }
}