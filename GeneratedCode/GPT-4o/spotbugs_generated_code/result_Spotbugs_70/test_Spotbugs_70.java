import org.junit.Test;
import static org.junit.Assert.*;

public class ReferenceComparisonBugDemoTest {

    @Test
    public void testShowBug() {
        ReferenceComparisonBugDemo demo = new ReferenceComparisonBugDemo();
        
        Integer a = new Integer(1000);
        Integer b = new Integer(1000);
        
        // This call should fail because it incorrectly uses '==' for Integer comparison
        assertFalse(demo.showBug(a, b)); // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }

    @Test
    public void testShowBugFloat() {
        ReferenceComparisonBugDemo demo = new ReferenceComparisonBugDemo();
        
        Float c = new Float(10.5f);
        Float d = new Float(10.5f);
        
        // This call should fail because it incorrectly uses '==' for Float comparison
        assertFalse(demo.showBugFloat(c, d)); // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
    }
}