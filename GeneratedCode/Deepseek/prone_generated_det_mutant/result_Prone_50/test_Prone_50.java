import org.junit.Test;
import static org.junit.Assert.*;

public class BugFloggerLogStringTest {

    private BugFloggerLogString bugFloggerLogString = new BugFloggerLogString();
    
    @Test
    public void testShowBug() {
        String nonCompileTimeConstant = "non compile time constant"; // TRIGGER BUG: FloggerLogString
        bugFloggerLogString.showBug(nonCompileTimeConstant);
    }
}