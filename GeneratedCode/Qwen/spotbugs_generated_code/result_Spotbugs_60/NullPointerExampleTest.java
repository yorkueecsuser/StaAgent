import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugWithException() {
        NullPointerExample example = new NullPointerExample();
        example.showBug("throw"); // TRIGGER BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
    }
}