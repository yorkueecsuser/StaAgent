import org.junit.Test;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        BugDemo bugDemo = new BugDemo();
        // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
        assertThrows(NoSuchElementException.class, bugDemo::showBug);
    }
}