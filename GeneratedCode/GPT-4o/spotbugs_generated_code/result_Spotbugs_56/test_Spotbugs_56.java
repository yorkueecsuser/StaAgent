import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample example = new BugExample();
        example.showBug(); // TRIGGER BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
    }
}