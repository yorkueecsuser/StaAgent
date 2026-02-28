import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo demo = new BugDemo();
        demo.showBug(); // TRIGGER BUG: UseCorrectExceptionLogging
    }
}