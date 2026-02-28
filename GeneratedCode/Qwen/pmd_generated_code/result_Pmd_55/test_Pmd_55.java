import org.junit.Test;
import static org.junit.Assert.*;

public class MisplacedNullCheckExampleTest {

    @Test
    public void testShowBugWithNullA() {
        MisplacedNullCheckExample example = new MisplacedNullCheckExample(null, "test");
        boolean result = example.showBug(); // TRIGGER BUG: MisplacedNullCheck
        assertFalse(result); // This assertion will not be reached due to the bug
    }

    @Test
    public void testShowBugWithNonNullA() {
        MisplacedNullCheckExample example = new MisplacedNullCheckExample("test", "test");
        boolean result = example.showBug();
        assertTrue(result);
    }
}