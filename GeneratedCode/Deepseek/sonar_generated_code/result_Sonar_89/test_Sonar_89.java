import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Getters and setters should be synchronized in pairs
        for (int i = 0; i < 100; i++) {  // TRIGGER BUG: Getters and setters should be synchronized in pairs
            bugExample.showBug();  // TRIGGER BUG: Getters and setters should be synchronized in pairs
        }
    }
}