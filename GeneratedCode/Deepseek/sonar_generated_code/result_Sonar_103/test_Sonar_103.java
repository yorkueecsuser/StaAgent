import org.junit.Test;

import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    // TRIGGER BUG: Blocks should be synchronized on "private final" fields
    public void testDoSomething() {
        bugExample.showBug(); // This is the line that triggers the bug
    }
}