import org.junit.Test;
import static org.junit.Assert.*;

public class WaitBugTest {
    @Test
    public void testShowBug() throws InterruptedException {
        WaitBug bug = new WaitBug();
        bug.showBug(); // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}