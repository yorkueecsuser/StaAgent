import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerLogVarargsExampleTest {

    @Test
    public void testShowBugWithFormatString() {
        FloggerLogVarargsExample example = new FloggerLogVarargsExample();
        example.showBug("This is a %s message with %d arguments.", "test", 2); // TRIGGER BUG: FloggerLogVarargs
        fail("Expected a logging format error due to improper varargs usage."); // This line will fail if an exception is not thrown
    }
}