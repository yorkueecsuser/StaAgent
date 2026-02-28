import org.junit.Test;
import static org.junit.Assert.*;

public class MutableArrayExposureTest {

    @Test
    public void testShowBugModifiesInternalArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] modifiedArray = MutableArrayExposure.showBug(); // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        assertNotEquals(originalArray[0], modifiedArray[0]); // This assertion will fail because the internal array has been modified
    }
}