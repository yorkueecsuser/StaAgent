import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyStringBufferTest {
    @Test
    public void testShowBug() {
        BuggyStringBuffer buggyObj = new BuggyStringBuffer();
        // TRIGGER BUG: StringBufferInstantiationWithChar
        assertEquals("Expected capacity to be 1, but it was not.", 1, buggyObj.showBug());
    }
}