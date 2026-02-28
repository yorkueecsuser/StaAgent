import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousReferenceComparisonTest {
    @Test
    public void testShowBug() {
        SuspiciousReferenceComparison src = new SuspiciousReferenceComparison();
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        assertFalse(src.showBug(a, b));
    }
}