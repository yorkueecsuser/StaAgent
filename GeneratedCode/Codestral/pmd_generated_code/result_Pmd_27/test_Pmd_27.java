import org.junit.Test;
import static org.junit.Assert.*;

public class CloseResourceBugTest {
    @Test
    public void testShowBug() {
        CloseResourceBug buggyClass = new CloseResourceBug();
        buggyClass.showBug();
        // TRIGGER BUG: CloseResource - since the resource is not closed in the finally block, this test will fail and trigger the bug
    }
}