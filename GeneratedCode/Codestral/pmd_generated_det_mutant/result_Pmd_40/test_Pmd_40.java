import org.junit.Test;
import static org.junit.Assert.*;

public class EmptyCatchBlockBugTest {

    @Test
    public void testShowBug() {
        EmptyCatchBlockBug buggyObject = new EmptyCatchBlockBug();
        buggyObject.showBug(); // TRIGGER BUG: EmptyCatchBlock
    }
}