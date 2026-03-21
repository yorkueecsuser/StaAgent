import org.junit.Test;
import static org.junit.Assert.*;

public class UnresolvableReferenceBugTest {
    @Test
    public void testShowBug() {
        UnresolvableReferenceBug bug = new UnresolvableReferenceBug("NonExistentClass");
        try {
            bug.showBug();
            fail("Expected ClassNotFoundException"); // TRIGGER BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        } catch (ClassNotFoundException e) {
            // Expected exception, do nothing
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}