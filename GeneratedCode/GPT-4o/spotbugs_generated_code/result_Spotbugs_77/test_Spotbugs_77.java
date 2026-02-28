import org.junit.Test;
import static org.junit.Assert.*;

public class UnrelatedEqualsTest {

    @Test
    public void testShowBug() {
        UnrelatedEquals example = new UnrelatedEquals();
        boolean result = example.showBug(); // TRIGGER BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        assertTrue("The comparison should fail due to unrelated class and interface", result);
    }
}