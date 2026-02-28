import org.junit.Test;
import static org.junit.Assert.*;

public class IgnoredReturnValueExampleTest {

    @Test
    public void testShowBug() {
        IgnoredReturnValueExample example = new IgnoredReturnValueExample();
        example.showBug("hello world"); // TRIGGER BUG: Return values from functions without side effects should not be ignored
        fail("The bug should have been triggered due to ignored return value."); // Ensure that the test case fails
    }
}