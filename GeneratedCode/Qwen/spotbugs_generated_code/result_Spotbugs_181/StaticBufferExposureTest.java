import org.junit.Test;
import static org.junit.Assert.*;

public class StaticBufferExposureTest {

    @Test
    public void testStaticBufferExposure() {
        StaticBufferExposure exposure = new StaticBufferExposure();
        int[] initialArray = {1, 2, 3};
        int[] returnedArray = exposure.showBug(initialArray); // TRIGGER BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)  

        // Modify the original array
        initialArray[0] = 99;

        // The test will fail because the staticArray in StaticBufferExposure has been modified indirectly
        assertNotEquals(returnedArray[0], initialArray[0]);
    }
}