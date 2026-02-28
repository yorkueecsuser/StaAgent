import org.junit.Test;
import static org.junit.Assert.*;

public class StaticReadResolveExampleTest {

    @Test
    public void testShowBug() {
        // Test case to trigger the bug
        String result = StaticReadResolveExample.showBug("Example");
        assertNull(result); // TRIGGER BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    }
}