import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    private BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        String arrayString = buggyCode.showBug();
        assertEquals("[1, 2, 3, 4, 5]", arrayString); // TRIGGER BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
    }
}