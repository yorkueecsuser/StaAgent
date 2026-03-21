import org.junit.Test;
import static org.junit.Assert.*;

public class OriginalClassNameTest {
    @Test(expected = Exception.class)
    public void testBug() {
        OriginalClassName.showBug(); // TRIGGER BUG: UnsafeWildcard
    }
}