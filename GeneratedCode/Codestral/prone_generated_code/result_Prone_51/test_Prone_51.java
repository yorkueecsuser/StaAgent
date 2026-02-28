import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerLogVarargsBugTest {
    @Test
    public void testShowBug() {
        FloggerLogVarargsBug bug = new FloggerLogVarargsBug();
        // TRIGGER BUG: FloggerLogVarargs
        bug.showBug("The number is: ", 5);
        // This line will trigger the bug as it concatenates a string with an integer.
        // The correct approach is to use logVarargs to pass the format string and arguments separately.
    }
}