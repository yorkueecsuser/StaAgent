import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionErrorExampleTest {

    @Test
    public void testShowBug() {
        AssertionErrorExample example = new AssertionErrorExample();
        example.showBug(); // TRIGGER BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
    }
}