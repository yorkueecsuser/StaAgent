import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionBugExampleTest {

    @Test
    public void testShowBug() {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug(); // TRIGGER BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    }
}