import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBug() {
        BugDemo.showBug(); // TRIGGER BUG: Child class methods named for parent class methods should be overrides
    }
}