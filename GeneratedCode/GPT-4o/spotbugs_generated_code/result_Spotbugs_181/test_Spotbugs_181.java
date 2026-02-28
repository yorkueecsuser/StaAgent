import org.junit.Test;
import static org.junit.Assert.*;

public class ExposeStaticStateTest {

    @Test
    public void testShowBugExposesSensitiveData() {
        byte[] externalArray = {1, 2, 3, 4, 5};
        byte[] returnedArray = ExposeStaticState.showBug(externalArray); // TRIGGER BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)

        // Modify the returned array
        returnedArray[0] = 99; // TRIGGER BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)

        // Assert that the external array's first element has changed, indicating exposure
        assertEquals(99, externalArray[0]); // This assertion is expected to fail if the bug is not present
    }
}