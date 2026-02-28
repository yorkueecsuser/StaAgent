import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyFutureTest {

    @Test
    public void testShowBug() throws Exception {
        BuggyFuture buggyFuture = new BuggyFuture();
        buggyFuture.showBug(); // TRIGGER BUG: FuturesGetCheckedIllegalExceptionType
    }
}