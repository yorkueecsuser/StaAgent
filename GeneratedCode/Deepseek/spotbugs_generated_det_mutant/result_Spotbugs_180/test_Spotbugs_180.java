import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        int[] originalArray = {1, 2, 3, 4, 5};
        BugExample bugExample = new BugExample(originalArray);

        bugExample.getArray()[0] = 10;

        // TRIGGER BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        assertNotEquals(originalArray, bugExample.showBug());
    }
}