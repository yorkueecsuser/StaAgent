import org.junit.Test;
import static org.junit.Assert.*;

public class MultipleLocksWaitBugTest {

    @Test
    public void testShowBug() {
        MultipleLocksWaitBug bugDemo = new MultipleLocksWaitBug();
        bugDemo.showBug();  // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}