import org.junit.Test;
import static org.junit.Assert.*;

public class BugSizeGreaterThanOrEqualsZeroTest {
    @Test
    public void testSizeGreaterThanOrEqualsZero() {
        BugSizeGreaterThanOrEqualsZero.showBug(); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }
}