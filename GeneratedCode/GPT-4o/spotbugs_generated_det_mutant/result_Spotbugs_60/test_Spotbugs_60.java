import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugExampleTest {

    @Test
    public void testShowBugWithInvalidFilePath() {
        NullPointerBugExample example = new NullPointerBugExample();
        example.showBug("invalidfile.txt"); // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }
    
    @Test
    public void testShowBugWithNullFilePath() {
        NullPointerBugExample example = new NullPointerBugExample();
        example.showBug(null); // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }
}