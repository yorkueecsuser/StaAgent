import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    BugDemo bugDemo = new BugDemo();

    @Test
    public void testBug() {
        bugDemo.showBug(); // TRIGGER BUG: CHECKERS_ANNOTATION_REACHABILITY_ERROR
    }
}