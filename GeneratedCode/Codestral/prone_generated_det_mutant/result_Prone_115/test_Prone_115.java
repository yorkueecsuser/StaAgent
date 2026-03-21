import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class MustBeClosedCheckerBugTest {
    @Test
    public void testShowBug() throws IOException {
        MustBeClosedCheckerBug buggyClass = new MustBeClosedCheckerBug();
        buggyClass.showBug(); // TRIGGER BUG: MustBeClosedChecker
    }
}