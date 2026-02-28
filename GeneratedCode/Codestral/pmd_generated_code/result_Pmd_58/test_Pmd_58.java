import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.showBug(); // TRIGGER BUG: MoreThanOneLogger
        // The bug is triggered because the showBug method uses two logger objects log1 and log2,
        // which is not the normal practice, according to the bug rule.
    }
}