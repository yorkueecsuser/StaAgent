import org.junit.Test;
import static org.junit.Assert.*;
import a.One; // Fixed: Use the canonical name for the static import

public class BugDemoTest {

    @Test
    public void testNonCanonicalStaticImport() {
        // TRIGGER BUG: NonCanonicalStaticImport
        One.Inner innerInstance = BugDemo.showBug();
        // The test will fail here because the static import of the inner class 'Inner' is using the non-canonical name
        // 'Two.Inner' instead of the canonical name 'a.One.Inner'. This causes a ClassNotFoundException.
        assertNotNull(innerInstance);
    }
}