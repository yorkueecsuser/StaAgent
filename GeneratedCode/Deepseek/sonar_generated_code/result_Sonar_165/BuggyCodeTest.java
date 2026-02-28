import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = Arrays.asList("a", "b", "c");
        buggyCode.showBug("hello", 5, strings);  // This line triggers the bug
    }
}