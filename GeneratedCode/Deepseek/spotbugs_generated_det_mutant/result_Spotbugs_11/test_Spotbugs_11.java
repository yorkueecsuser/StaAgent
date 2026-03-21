import org.junit.Test;
import static org.junit.Assert.*;

public class CAA_COVARIANT_ARRAY_ELEMENT_STORETest {
    private CAA_COVARIANT_ARRAY_ELEMENT_STORE caa = new CAA_COVARIANT_ARRAY_ELEMENT_STORE();

    @Test
    public void testShowBug() {
        try {
            caa.showBug(); // TRIGGER BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
            fail("Expected an ArrayStoreException to be thrown"); // This line will only be executed if the bug is not triggered
        } catch (ArrayStoreException anse) {
            // Expected behavior
        }
    }
}