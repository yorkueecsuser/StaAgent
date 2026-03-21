import org.junit.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        bugExample.showBug(); // This line triggers the bug
    }
}