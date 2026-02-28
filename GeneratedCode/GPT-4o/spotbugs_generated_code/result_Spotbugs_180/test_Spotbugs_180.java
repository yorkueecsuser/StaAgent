import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBufferExposureTest {

    @Test
    public void testExposeInternalArray() {
        int[] externalArray = {1, 2, 3};
        ArrayBufferExposure bufferExposure = new ArrayBufferExposure(externalArray);
        
        bufferExposure.showBug(externalArray); // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // The test should fail because the internal array is exposed and modified through externalArray
        assertEquals("The internal array should not be exposed and modified.", 1, bufferExposure.getInternalArray()[0]); // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }
}