import org.junit.Test;
import static org.junit.Assert.*;

public class UnrelatedInterfaceComparisonTest {
    @Test
    public void testShowBug() {
        UnrelatedInterfaceComparison uic = new UnrelatedInterfaceComparison();
        assertFalse(uic.showBug()); // TRIGGER BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}