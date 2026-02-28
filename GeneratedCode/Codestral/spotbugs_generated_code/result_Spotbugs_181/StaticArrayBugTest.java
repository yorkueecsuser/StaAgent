import org.junit.Test;
import static org.junit.Assert.*;

public class StaticArrayBugTest {

    @Test
    public void testShowBug() {
        int[] externalArray = {1, 2, 3, 4, 5};
        StaticArrayBug.showBug(externalArray); // TRIGGER BUG: MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)
        assertEquals(100, externalArray[0]); // This will fail as the buggyArray[0] is modified in the showBug method
    }
}