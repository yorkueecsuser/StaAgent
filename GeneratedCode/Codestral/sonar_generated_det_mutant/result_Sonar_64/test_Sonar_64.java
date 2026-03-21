import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExceptionHandlingTest {

    @Test(expected = IllegalArgumentException.class) // TRIGGER BUG: Exceptions should not be created without being thrown
    public void testShowBug() {
        BuggyExceptionHandling buggyExceptionHandling = new BuggyExceptionHandling();
        buggyExceptionHandling.showBug(-1);
    }
}