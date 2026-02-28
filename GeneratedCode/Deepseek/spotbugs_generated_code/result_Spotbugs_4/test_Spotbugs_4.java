import org.junit.Test;
import static org.junit.Assert.*;

public class UnresolvableReferenceBugTest {
    @Test
    public void testShowBug() {
        UnresolvableReferenceBug buggyClass = new UnresolvableReferenceBug();

        // TRIGGER BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        buggyClass.showBug();
    }
}