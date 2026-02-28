import org.junit.Test;
import static org.junit.Assert.*;

public class MissingTestCallBugTest {

    MissingTestCallBug bug = new MissingTestCallBug();

    @Test
    public void testString() {
        bug.showBug(); // Trigger BUG: MissingTestCall
    }
}