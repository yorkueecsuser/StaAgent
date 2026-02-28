import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: Methods with Spring proxying annotations should be public
    public void testShowBug() {
        BugExample bug = new BugExample();
        bug.showBug();
    }
}