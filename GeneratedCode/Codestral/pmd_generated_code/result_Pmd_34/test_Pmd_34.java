import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyExceptionTest {
    @Test
    public void testShowBug() {
        BuggyException buggyException = new BuggyException("Test Message");
        buggyException.showBug(); // TRIGGER BUG: DoNotExtendJavaLangThrowable
    }
}