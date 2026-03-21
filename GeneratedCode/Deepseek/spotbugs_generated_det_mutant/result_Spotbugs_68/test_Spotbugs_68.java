import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        buggyCode.showBug(null); // TRIGGER BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
    }
}