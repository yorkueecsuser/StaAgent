import org.junit.Test;
import static org.junit.Assert.*;

public class SuspiciousReferenceComparisonTest {

    @Test
    public void testShowBug() {
        SuspiciousReferenceComparison s1 = new SuspiciousReferenceComparison();
        // TRIGGER BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        assertFalse(s1.showBug());
    }
}