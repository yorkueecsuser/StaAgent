import org.junit.Test;
import static org.junit.Assert.*;

public class MutableArrayExposureTest {

    @Test
    public void testShowBug() {
        // Call the method that demonstrates the bug
        MutableArrayExposure.showBug(); // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        
        // Assert that the first element is "Apple", it should fail because it was changed to "Mango"
        assertEquals("Apple", MutableArrayExposure.getFruits()[0]); // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }
}