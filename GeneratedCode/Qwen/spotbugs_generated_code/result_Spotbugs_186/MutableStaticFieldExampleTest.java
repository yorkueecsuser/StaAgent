import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldExampleTest {

    @Test
    public void testShowBugModifiesStaticField() {
        MutableStaticFieldExample example1 = new MutableStaticFieldExample();
        MutableStaticFieldExample example2 = new MutableStaticFieldExample();

        // Initial state check
        assertEquals("Initial Value", example1.showBug("Initial Value"));

        // Modify the static field through one instance
        example1.showBug("Modified Value"); // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)

        // Check if the modification is reflected in another instance
        assertEquals("Modified Value", example2.showBug("This should not be the value")); // This assertion will fail
    }
}