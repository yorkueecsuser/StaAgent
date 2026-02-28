import org.junit.Test;
import static org.junit.Assert.*;

public class EmptyCatchBlockBugTest {
    @Test
    public void testBug() throws Exception {
        try {
            EmptyCatchBlockBug buggyMethod = new EmptyCatchBlockBug();
            buggyMethod.showBug();
        } catch (Exception e) {
            // TRIGGER BUG: EmptyCatchBlock
            assertTrue("Exception should be caught and reported", false);
        }
    }
}