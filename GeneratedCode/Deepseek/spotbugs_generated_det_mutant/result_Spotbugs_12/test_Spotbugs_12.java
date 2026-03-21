import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test(expected = UnsupportedOperationException.class)
    public void testShowBug() {
        bugExample.showBug(); // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
    }
}