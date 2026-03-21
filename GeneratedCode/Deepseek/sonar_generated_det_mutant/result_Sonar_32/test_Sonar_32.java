import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    public void testShowBugFails() {
        Main.showBug();
    }
}