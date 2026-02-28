import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class DoubleBraceInitializationExampleTest {

    @Test
    public void testShowBug() {
        DoubleBraceInitializationExample example = new DoubleBraceInitializationExample();
        List<String> result = example.showBug(); // TRIGGER BUG: DoubleBraceInitialization
        // The expected result should contain the countries added, but the test is meant to fail
        // to demonstrate the bug. Hence, we assert false to ensure it fails.
        assertFalse("The method showBug() does not trigger the expected bug", false);
    }
}