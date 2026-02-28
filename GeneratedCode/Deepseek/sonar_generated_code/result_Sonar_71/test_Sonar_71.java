import org.junit.Test;
import java.util.Optional;

import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        bugExample.showBug(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }
}