import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidDateBugTest {
    @Test
    public void testBug() {
        InvalidDateBug bug = new InvalidDateBug();
        bug.showBug(); // TRIGGER BUG: Invalid "Date" values should not be used
    }
}