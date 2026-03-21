import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug(); // TRIGGER BUG: GuiceAssistedInjectScoping
        // ASSERTIONS HERE
    }
}